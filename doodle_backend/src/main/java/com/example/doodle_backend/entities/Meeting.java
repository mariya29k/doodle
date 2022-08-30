package com.example.doodle_backend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "meetings")
public class Meeting {
    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "meeting_id")
    private int meetingId;

    @Column(name = "date_from", nullable = false)
    private LocalDateTime dateFrom;

    @Column(name = "date_to",nullable = false)
    private LocalDateTime dateTo;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "meeting", fetch = FetchType.EAGER)
    private List<MeetingUserSlot> users = new ArrayList<>();

}
