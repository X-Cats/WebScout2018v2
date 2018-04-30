import { Component, OnInit } from '@angular/core';
import {TeamserviceService} from "../teamservice.service";

@Component({
  selector: 'app-teamview',
  templateUrl: './app-teamview.component.html',
  styleUrls: ['./app-teamview.component.css']
})
export class AppTeamviewComponent implements OnInit {

  constructor(private teamserver: TeamserviceService) { }

  ngOnInit() {
    this.updateTeam(191);
  }

  updateTeam(num: number) {
    this.teamserver.setTeam(num);
  }
}
