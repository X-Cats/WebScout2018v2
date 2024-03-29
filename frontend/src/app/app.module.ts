import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule} from "@ng-bootstrap/ng-bootstrap";
import { ChartsModule} from "ng-charts";
import { HttpClientModule } from "@angular/common/http";
import { RouterModule } from "@angular/router";
import { NgbDropdownModule } from "@ng-bootstrap/ng-bootstrap";
import { FormsModule } from "@angular/forms";
import { AngularFontAwesomeModule } from "angular-font-awesome";
import { DataTablesModule } from "angular-datatables";

import { AppComponent } from './app.component';
import { AppNavbarComponent } from './app-navbar/app-navbar.component';
import { AppTeamviewComponent } from './app-teamview/app-teamview.component';
import { AppPicklistComponent } from './app-picklist/app-picklist.component';
import { TeamgraphComponent } from './app-teamview/teamgraph/teamgraph.component';
import { TeamtablesComponent } from './app-teamview/teamtables/teamtables.component';
import { TeamserviceService} from "./teamservice.service";
import {Routes} from "@angular/router";
import { PickModalComponent } from './app-picklist/pick-modal/pick-modal.component';
import { PickTableComponent } from './app-picklist/pick-table/pick-table.component';

const routes: Routes = [
  {path: '', component: AppTeamviewComponent},
  {path: 'teams', component: AppTeamviewComponent},
  {path: 'pick', component: AppPicklistComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    AppNavbarComponent,
    AppTeamviewComponent,
    AppPicklistComponent,
    TeamgraphComponent,
    TeamtablesComponent,
    PickModalComponent,
    PickTableComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ChartsModule,
    FormsModule,
    RouterModule.forRoot(routes, {useHash: true}),
    NgbDropdownModule,
    AngularFontAwesomeModule,
    DataTablesModule,
    NgbModule
  ],
  providers: [TeamserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }


