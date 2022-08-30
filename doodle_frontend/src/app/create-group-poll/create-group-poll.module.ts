import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateGroupPollComponent } from './components/create-group-poll/create-group-poll.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";

@NgModule({
    declarations: [
        CreateGroupPollComponent
    ],
    exports: [
        CreateGroupPollComponent
    ],
    imports: [
      CommonModule,
      FormsModule,
      ReactiveFormsModule
    ]
})
export class CreateGroupPollModule { }
