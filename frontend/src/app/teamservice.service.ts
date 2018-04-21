import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders} from "@angular/common/http";

@Injectable()
export class TeamserviceService {

  constructor(private _http: HttpClient) { }

  updateTeams() {
    return this._http.get("http://localhost:8080/teams");
  }
}
