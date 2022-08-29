package com.example.doodle_backend.repositories;

import com.example.doodle_backend.entities.MeetingUserKey;
import com.example.doodle_backend.entities.MeetingUserSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingUserRepository extends JpaRepository<MeetingUserSlot, MeetingUserKey> { //first is table, second is key
}
