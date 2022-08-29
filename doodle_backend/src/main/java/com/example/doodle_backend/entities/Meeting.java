package com.example.doodle_backend.entities;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int meetingId;

    @Column(nullable = false)
    private LocalDateTime dateFrom;

    @Column(nullable = false)
    private LocalDateTime dateTo;

    @Column(nullable = false)
    private String title;

    @Column()
    private String description;

    @OneToMany(mappedBy = "meeting", fetch = FetchType.EAGER)
    private List<MeetingUserSlot> users = new ArrayList<>();

}
