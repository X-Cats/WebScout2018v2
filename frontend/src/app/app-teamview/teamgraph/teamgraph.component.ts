import { Component, OnInit } from '@angular/core';
import * as Chart from 'chart.js';
import { TeamserviceService} from "../../teamservice.service";
import 'rxjs/add/operator/map';
import {Stats} from "../../team";

function genLabels (x: number) {
  let out = [];
  for(let i = 0; i<x; i++){
    out.push("Match " + (i+1));
  }
  console.log(out);
  return out;
}

@Component({
  selector: 'team-teamgraph',
  templateUrl: './teamgraph.component.html',
  styleUrls: ['./teamgraph.component.css']
})

export class TeamgraphComponent implements OnInit {

  currStats: Stats;

  chart = {};


  constructor(private teamserver: TeamserviceService) { }

  ngOnInit() {
    this.teamserver.currentTeam.subscribe(team => {
      this.currStats = team.stats;

      this.chart = new Chart("canvas", {
          type:'line',
          data: {
            labels: genLabels(this.currStats.totalMatchesPlayed),
            datasets: [
              {
                data: this.currStats.scaleData,
                label: "Scale",
                borderColor: "#f8ca00"
              },
              {
                data: this.currStats.switchData,
                label: "Switch",
                borderColor:"#00c853"
              },
              {
                data: this.currStats.oppSwitchData,
                label: "Opp. Switch",
                borderColor: "#b5b0b0"
              },
              {
                data: this.currStats.exchangeData,
                label: "Exchange"
              }
            ]
          },
          options: this.options
        });
      console.log(team);
    })
  }

  options = {
    scales: {
      yAxes: [{
        stacked:true
      }]
    }
  }



}
