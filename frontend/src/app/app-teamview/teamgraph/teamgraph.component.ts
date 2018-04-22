import { Component, OnInit } from '@angular/core';
import { TeamserviceService} from "../../teamservice.service";
import 'rxjs/add/operator/map';

@Component({
  selector: 'team-teamgraph',
  templateUrl: './teamgraph.component.html',
  styleUrls: ['./teamgraph.component.css']
})
export class TeamgraphComponent implements OnInit {

  chart = [];

  num = 0;

  constructor(private teamserver: TeamserviceService) { }

  ngOnInit() {
    this.teamserver.updateTeams()
      .subscribe(teams => {
      let allteams = teams;
      console.log(teams);
    })
  }

  options = {
    scales: {
      yAxes: [{
        stacked:true
      }]
    }
  }

  // this.chart = new Chart('statsGraph', {
  //   type:'line',
  //   data: {
  //
  //   },
  //   options: this.options
  // })
}
