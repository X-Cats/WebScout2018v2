import { Component, OnInit } from '@angular/core';
import {TeamserviceService} from "../teamservice.service";
import {Team} from "../team";

@Component({
  selector: 'app-app-picklist',
  templateUrl: './app-picklist.component.html',
  styleUrls: ['./app-picklist.component.css']
})
export class AppPicklistComponent implements OnInit {

  constructor(private teamserver: TeamserviceService) { }

  teams: Array<Team>;
  num: number;
  ngOnInit() {
    this.teamserver.getAllTeams().subscribe(teams => {
      this.teams = teams.map(teams => teams);
      this.num = teams.map(teams => teams).length;
    });
  }

}
