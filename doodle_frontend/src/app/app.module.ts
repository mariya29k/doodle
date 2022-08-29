import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import {CreateGroupPollComponent} from "./create-group-poll/components/create-group-poll/create-group-poll.component";
import {CreateGroupPollModule} from "./create-group-poll/create-group-poll.module";
import {ApiHttpService} from "./config/api-http.service";
import {ApiEndpointsService} from "./core/services/api-endpoints.service";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    CreateGroupPollModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

