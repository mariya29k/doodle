package com.example.doodle_backend.repositories;

import com.example.doodle_backend.entities.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingRepository extends JpaRepository<Meeting, Integer> {
    Meeting previewMeeting(long id);
}
