import { Component, OnInit } from '@angular/core';
import {TeamserviceService} from "../../teamservice.service";
import {Team} from "../../team";
import {Subject} from "rxjs/Subject";

@Component({
  selector: 'app-pick-table',
  templateUrl: "./pick-table.component.html",
  styleUrls: ['./pick-table.component.css']
})
export class PickTableComponent implements OnInit {

  constructor(private teamserver: TeamserviceService) {

  }
  teams: Team[] = [];

  dtOptions: DataTables.Settings = {
    paging: false,
    searching: false
  };

  dtTrigger: Subject<any> = new Subject<any>();

  ngOnInit() {
    this.teamserver.getAllTeams().subscribe(
      teams => {
        this.teams = teams;
        this.dtTrigger.next();
      });
  };

}
