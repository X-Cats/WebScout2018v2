import { Component, OnInit } from '@angular/core';
import {TeamserviceService} from "../../teamservice.service";
import {ISuperTableColumn, superTableSorters, ISuperTableOptions} from "ngx-super-table";

@Component({
  selector: 'app-pick-table',
  template: `
    <super-table
      [rows]="rows"
      [columns]="columns"
      [options]="options"
      [tableClasses]="tableClasses">
      
    </super-table>
  `,
  styleUrls: ['./pick-table.component.css']
})
export class PickTableComponent implements OnInit {

  constructor(private teamserver: TeamserviceService) {

  }
  tableClasses: string[] = ['table','table-bordered'];
  rows: PickRow[] = [];

  columns: ISuperTableColumn[] = [
    {
      id: 'teamNum',
      key: 'teamNum',
      label: 'Team Num',
    },
    {
      id: 'percFocusScale',
      key: 'percFocusScale',
      label: 'Scale Focus (%)'
    }
  ];

  options: ISuperTableOptions = {
    //autoHeight: true
  };

  ngOnInit() {
    this.teamserver.getAllTeams().subscribe(
      teams => {
        for(let i=0; i < teams.length; i++) {
          this.rows.push({
            teamNum: teams[i].teamNum,
            percFocusScale: teams[i].stats.percentFocusScale
          });
        }
        console.log(this.rows);
      });
  };

}
export interface PickRow {
  teamNum: number;
  percFocusScale: number;
}
