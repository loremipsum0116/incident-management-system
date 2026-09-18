package com.incidentmanagement.domain;

public class Incident {

    private long id;
    private String title;
    private int severity;
    private String status;

    public Incident(long id, String title, int severity) {
        changeSeverity(severity);
        changeTitle(title);
        this.status = "OPEN";
        this.id = id;
    }

    public void changeSeverity(int severity) {
        if (severity < 1 || severity > 5) {
            throw new IllegalArgumentException();
        }
        this.severity = severity;
    }

    public void changeTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.title = title;
    }

    public void close() {
        if (this.status.equals("CLOSED")) {
            throw new IllegalStateException();
        }
        this.status = "CLOSED";
    }
}
