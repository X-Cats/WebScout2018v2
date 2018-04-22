import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders} from "@angular/common/http";
import 'rxjs/add/operator/map';
import {Team} from "./team";
import {environment} from "../environments/environment";

@Injectable()
export class TeamserviceService {

  constructor(private _http: HttpClient) { }

  public updateTeams() {
    return this._http.get<Array<Team>>(environment.api + "/teams");
  }
}
