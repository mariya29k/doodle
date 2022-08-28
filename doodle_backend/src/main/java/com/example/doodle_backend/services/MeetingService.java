package com.example.doodle_backend.services;

import com.example.doodle_backend.entities.Meeting;
import com.example.doodle_backend.repositories.MeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingService {
    @Autowired
    private MeetingRepository meetingRepository;

    public MeetingService(MeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }

    public Meeting persistMeeting(Meeting meeting){
        return meeting;
    }

    public Meeting previewMeeting (long id){
        return meetingRepository.previewMeeting(id);
    }
}
