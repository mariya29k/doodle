package com.example.doodle_backend.controllers;

import com.example.doodle_backend.entities.Meeting;
import com.example.doodle_backend.services.MeetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/meeting")
public class MeetingController {

    private MeetingService meetingService;

    @Autowired
    public MeetingController(MeetingService meetingService) {
        this.meetingService = meetingService;
    }

    @PostMapping()
    @CrossOrigin
    public ResponseEntity<Meeting> persistMeeting(@RequestBody Meeting meeting) {
        return new ResponseEntity<>(meetingService.persistMeeting(meeting), HttpStatus.OK);
    }

    @GetMapping("/{meetingId}")
    @CrossOrigin
    public ResponseEntity<Meeting> getMeetingById(@PathVariable("meetingId") int meetingId)  {
        return new ResponseEntity<>(meetingService.getMeetingById(meetingId), HttpStatus.OK);
    }

}
