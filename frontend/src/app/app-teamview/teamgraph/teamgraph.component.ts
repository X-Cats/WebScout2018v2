import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'team-teamgraph',
  templateUrl: './teamgraph.component.html',
  styleUrls: ['./teamgraph.component.css']
})
export class TeamgraphComponent implements OnInit {

  chart = [];

  constructor() { }

  ngOnInit() {
  }

  options = {
    scales: {
      yAxes: [{
        stacked:true
      }]
    }
  }

  chart = new Chart('statsGraph', {
    type:'line',
    data: {

    },
    options: this.options
  })
}
