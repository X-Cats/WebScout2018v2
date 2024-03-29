import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import {TeamserviceService} from "../teamservice.service";

@Component({
  selector: 'app-navbar',
  templateUrl: './app-navbar.component.html',
  styleUrls: ['./app-navbar.component.css']
})
export class AppNavbarComponent implements OnInit {

  constructor(private router: Router, private teamserver: TeamserviceService) { }

  goTeam() {
    this.router.navigate(['teams']);
  }

  goPick() {
    this.router.navigate(['pick']);
  }

  ngOnInit() {
  }

  handleFileUpload(files: FileList) {
    this.teamserver.addMatchData(files);
  }


}
