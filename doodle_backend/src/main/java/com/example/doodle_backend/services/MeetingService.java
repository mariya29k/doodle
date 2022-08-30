package com.example.doodle_backend.services;

import com.example.doodle_backend.entities.Meeting;
import com.example.doodle_backend.entities.MeetingUserKey;
import com.example.doodle_backend.entities.MeetingUserSlot;
import com.example.doodle_backend.repositories.MeetingRepository;
import org.springframework.beans.MethodInvocationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MeetingService {
    @Autowired
    private MeetingRepository meetingRepository;

    private int idGenerator = 17412;

    public Meeting persistMeeting(Meeting meeting) {
        Meeting newMeeting = new Meeting();
        newMeeting.setMeetingId(idGenerator++);
        newMeeting.setDateFrom(meeting.getDateFrom());
        newMeeting.setDateTo(meeting.getDateTo());
        newMeeting.setTitle(meeting.getTitle());
        newMeeting.setDescription(meeting.getDescription());
        List<MeetingUserSlot> users = new ArrayList<>();
        newMeeting.setUsers(users);
        meetingRepository.save(newMeeting);
        return newMeeting;
    }

//    public Meeting persistMeeting(Meeting meeting){
//        return meeting;
//    }

    public Meeting getMeetingById(int id) {
        return meetingRepository.findByMeetingId(id);
    }
}
