import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import 'rxjs/add/operator/map';
import {Team} from "./team";
import {environment} from "../environments/environment";
import {Observable} from "rxjs/Observable";
import {Subject} from "rxjs/Subject";
import 'rxjs/add/operator/switchMap';

@Injectable()
export class TeamserviceService {

  constructor(private _http: HttpClient) {
    this.setTeam(191);
    this.currentTeamNum.subscribe(num => this.getTeam(num));
  }

  private currentTeamSource = new Subject<Team>();
  currentTeam = this.currentTeamSource.asObservable();

  private currentTeamNumSource = new Subject<number>();
  currentTeamNum = this.currentTeamNumSource.asObservable();

  public setTeam(num: number) {
    this.currentTeamNumSource.next(num);
  }

  private getTeam(num: number) {
    let params = new HttpParams();
    params = params.append('num',num.toString());
    let resObject = this._http.get<Array<Team>>(environment.api + "/teams", {params}).map(response => response[0]);
    resObject.subscribe( team => this.currentTeamSource.next(team));
  }

  public getAllTeams() {
    return this._http.get<Array<Team>>(environment.api + "/teams").map(response => response);
  }

}
