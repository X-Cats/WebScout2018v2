import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule} from "@ng-bootstrap/ng-bootstrap";
import { ChartsModule} from "ng-charts";

import { AppComponent } from './app.component';
import { AppNavbarComponent } from './app-navbar/app-navbar.component';
import { AppTeamviewComponent } from './app-teamview/app-teamview.component';
import { AppPicklistComponent } from './app-picklist/app-picklist.component';
import { TeamgraphComponent } from './app-teamview/teamgraph/teamgraph.component';
import { TeamtablesComponent } from './app-teamview/teamtables/teamtables.component';


@NgModule({
  declarations: [
    AppComponent,
    AppNavbarComponent,
    AppTeamviewComponent,
    AppPicklistComponent,
    TeamgraphComponent,
    TeamtablesComponent
  ],
  imports: [
    BrowserModule,
    ChartsModule,
    NgbModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
