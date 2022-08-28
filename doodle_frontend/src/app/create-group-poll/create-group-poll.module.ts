import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateGroupPollComponent } from './components/create-group-poll/create-group-poll.component';



@NgModule({
    declarations: [
        CreateGroupPollComponent
    ],
    exports: [
        CreateGroupPollComponent
    ],
    imports: [
        CommonModule
    ]
})
export class CreateGroupPollModule { }
