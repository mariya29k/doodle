package com.example.doodle_backend.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Embeddable
public class MeetingUserKey implements Serializable { //for primary key purposes
    @Column(name = "meeting_id")
    private int meetingId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "slot")
    private LocalDateTime slot;

}
