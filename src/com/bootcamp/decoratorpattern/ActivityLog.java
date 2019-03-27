package com.bootcamp.decoratorpattern;

import java.util.ArrayList;
import java.util.List;

class ActivityLog {

    private List<String> logs;

    ActivityLog() {
        this.logs = new ArrayList<>();
    }

    String add(String log) {
        this.logs.add(log);
        return log;
    }
}
