import { Component, OnInit } from '@angular/core';
import {TeamserviceService} from "../../teamservice.service";
import 'rxjs/add/operator/map';

@Component({
  selector: 'team-teamtables',
  templateUrl: './teamtables.component.html',
  styleUrls: ['./teamtables.component.css']
})
export class TeamtablesComponent implements OnInit {

  constructor(private teamserver: TeamserviceService) { }

  switchFocus = 0;
  scaleFocus = 0;
  oppSwitchFocus = 0;
  exchangeFocus = 0;

  percSwitchFocus = 0;
  percScaleFocus = 0;
  percOppSwitchFocus = 0;
  percExchangeFocus = 0;

  avgFocusedSwitch= 0;
  avgFocusedScale = 0;
  avgFocusedOppSwitch = 0;
  avgFocusedExchange = 0;

  ngOnInit() {
    this.teamserver.updateTeams()
      .subscribe(teams => {
        let stats = teams.map(teams => teams.stats);

        this.switchFocus = stats[0].focusSwitch;
        this.scaleFocus = stats[0].focusScale;
        this.oppSwitchFocus = stats[0].focusOppSwitch;
        this.exchangeFocus = stats[0].focusExchange;

        this.percSwitchFocus = stats[0].percentFocusSwitch;
        this.percScaleFocus = stats[0].percentFocusScale;
        this.percOppSwitchFocus = stats[0].percentFocusOppSwitch;
        this.percExchangeFocus = stats[0].percentFocusExchange;

        this.avgFocusedSwitch = stats[0].focusedAverageSwitch;
        this.avgFocusedScale = stats[0].focusedAverageScale;
        this.avgFocusedOppSwitch = stats[0].focusedAverageOppSwitch;
        this.avgFocusedExchange = stats[0].focusedAverageExchange;

        console.log(stats);
      })
  }

}
