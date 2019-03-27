package com.bootcamp.decoratorpattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActivityLogTest {

    @Test
    void shouldAddLogToActivityLogAndReturnAddedLog() {
        ActivityLog activityLog = new ActivityLog();

        String actual = activityLog.add("This is First Log.");
        String expected = "This is First Log.";

        assertEquals(expected,actual);
    }

//    @Test
//    void shouldAddLogToActivityLogWithTimeStamp() {
//
//
//        String actual = activityLog.add(timeStamp,"This is First Log.");
//        String expected = "This is First Log.";
//
//        assertEquals(expected,actual);
//    }
}