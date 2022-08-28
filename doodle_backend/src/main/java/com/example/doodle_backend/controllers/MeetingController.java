package com.example.doodle_backend.controllers;

import com.example.doodle_backend.entities.Meeting;
import com.example.doodle_backend.services.MeetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/meeting")
public class MeetingController {

    private final MeetingService meetingService;

    @PostMapping()
    @CrossOrigin
    public ResponseEntity<Meeting> persistMeeting(@RequestBody Meeting meeting) {
        return new ResponseEntity<>(meetingService.persistMeeting(meeting), HttpStatus.OK);
    }

//    @GetMapping("/{meetingId}")
//    @CrossOrigin
//    public ResponseEntity<Meeting> previewMeeting(@PathVariable long meetingId)  {
//        return new ResponseEntity<>(meetingService.previewMeeting(meetingId), HttpStatus.OK);
//    }

}
