import {Component, Directive, OnInit} from '@angular/core';
import {TeamserviceService} from "../../teamservice.service";
import {Team} from "../../team";
import {Subject} from "rxjs/Subject";

@Component({
  selector: 'app-pick-table',
  templateUrl: './pick-table.component.html',
  styleUrls: ['./pick-table.component.css']
})
export class PickTableComponent implements OnInit {

  display = 'none';

  constructor(private teamserver: TeamserviceService) {}

  teams: Team[] = [];

  pickedTeam: Team;

  dtOptions: DataTables.Settings = {
    paging: false,
    searching: false,
    columnDefs: [{
      searchable:false,
      orderable: false,
      targets: 0
    }],
    order:[[1,'asc']],
  };

  dtTrigger: Subject<any> = new Subject<any>();

  ngOnInit() {
    this.teamserver.getAllTeams().subscribe(
      teams => {
        this.teams = teams;
        this.dtTrigger.next();
      });
  };

  openPickModal(team: Team) {
    this.pickedTeam = team;
    this.display = 'block';
  }

  onCloseHandled() {
    this.display = 'none';
  }

}
