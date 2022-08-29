package com.example.doodle_backend.services;

import com.example.doodle_backend.entities.Meeting;
import com.example.doodle_backend.repositories.MeetingRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MeetingService {
    @Autowired
    private MeetingRepository meetingRepository;

    public Meeting persistMeeting(Meeting meeting) {
        return meeting;
    }

    public Meeting getMeetingById(int id) {
        return meetingRepository.findByMeetingId(id);
    }
}
