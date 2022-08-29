package com.example.doodle_backend.utils;

public class SqlScript {
    private SqlScript(){}

    public static final String GET_MEETING = "SELECT id, title, description, date_from, date_to FROM meetings WHERE meeting_id = :meetingId";
}
