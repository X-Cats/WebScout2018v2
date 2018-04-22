import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";

@Component({
  selector: 'app-navbar',
  templateUrl: './app-navbar.component.html',
  styleUrls: ['./app-navbar.component.css']
})
export class AppNavbarComponent implements OnInit {

  constructor(private router: Router) { }

  goTeam() {
    this.router.navigate(['']);
  }

  goPick() {
    this.router.navigate(['']);
  }

  ngOnInit() {
  }

}
