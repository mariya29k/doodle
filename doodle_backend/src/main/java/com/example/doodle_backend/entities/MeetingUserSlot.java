package com.example.doodle_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "meetings_users")
public class MeetingUserSlot {
    @EmbeddedId
    MeetingUserKey id;

    @ManyToOne
    @MapsId("meetingId")
    @JoinColumn(name = "meeting_id")
    private Meeting meeting;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    public MeetingUserSlot() {
    }
}
