import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule} from "@ng-bootstrap/ng-bootstrap";

import { AppComponent } from './app.component';
import { AppNavbarComponent } from './app-navbar/app-navbar.component';
import { AppTeamviewComponent } from './app-teamview/app-teamview.component';
import { AppPicklistComponent } from './app-picklist/app-picklist.component';


@NgModule({
  declarations: [
    AppComponent,
    AppNavbarComponent,
    AppTeamviewComponent,
    AppPicklistComponent
  ],
  imports: [
    BrowserModule,
    NgbModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
