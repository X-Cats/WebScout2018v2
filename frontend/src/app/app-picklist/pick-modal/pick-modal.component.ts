import {Component, Input, OnInit} from '@angular/core';
import {Team} from "../../team";

@Component({
  selector: 'app-pick-modal',
  templateUrl: './pick-modal.component.html',
  styleUrls: ['./pick-modal.component.css']
})
export class PickModalComponent implements OnInit {

  constructor() { }

  @Input() team: Team;

  ngOnInit() {
  }

}
