import { Component, OnInit } from '@angular/core';
import {TeamserviceService} from "../../teamservice.service";
import 'rxjs/add/operator/map';
import {Stats, Team} from "../../team";
import {Observable} from "rxjs/Observable";

@Component({
  selector: 'team-teamtables',
  templateUrl: './teamtables.component.html',
  styleUrls: ['./teamtables.component.css']
})
export class TeamtablesComponent implements OnInit {

  constructor(private teamserver: TeamserviceService) { }

  currStats: Stats;

  ngOnInit() {
    this.teamserver.currentTeam.subscribe(team => {
      this.currStats = team.stats;
    })
  }

}
