import { Component, OnInit } from '@angular/core';
import {ApiService} from "../../../core/services/api.service";
import {Router} from "@angular/router";
import {Meeting} from "../../../shared/classes/meeting";


@Component({
  selector: 'app-create-group-poll',
  templateUrl: './create-group-poll.component.html',
  styleUrls: ['./create-group-poll.component.css']
})
export class CreateGroupPollComponent implements OnInit {
  title: string | undefined;
  description: string | undefined;
  times: Date[] = [];
  date: Date = new Date();
  time: Date = new Date();
  newTime: Date = new Date();

  constructor(public apiService: ApiService,
              public router: Router) { }

  ngOnInit(): void {
  }

  addNewTime(event: Event){
    event.preventDefault();
    this.newTime = new Date(this.date.toString()+"T"+this.time.toString());
    this.times.push(this.newTime);
  }

  submit(event: Event) {
    event.preventDefault();
    this.apiService.addMeeting({
      title: this.title,
      description: this.description,
      dateTo: this.newTime,
      dateFrom: this.newTime
    }).subscribe({
      next: async (meeting) => {
        //await this.router.navigate([`meetings`, meeting.id])
        console.log("ok");
      },
      error: (err) => {
        console.log("error")
      }
    });
  }
}
