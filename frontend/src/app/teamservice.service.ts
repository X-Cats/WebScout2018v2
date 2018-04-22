import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders} from "@angular/common/http";
import 'rxjs/add/operator/map';

@Injectable()
export class TeamserviceService {

  constructor(private _http: HttpClient) { }

  public updateTeams() {
    return this._http.get("http://localhost:8080/teams").map(result => result);
  }
}
