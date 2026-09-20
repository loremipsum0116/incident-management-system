package com.incidentmanagement.domain;

public class Incident {

    private long id;
    private String title;
    private Severity severity;
    private IncidentStatus status;
    private User assignee;

    public Incident(long id, String title, Severity severity) {
        changeSeverity(severity);
        changeTitle(title);
        this.status = IncidentStatus.OPEN;
        this.id = id;
    }

    public void changeSeverity(Severity severity) {
        if (severity == null) {
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


    public void assignTo(User user) {
        if (user == null) {
            throw new IllegalArgumentException();
        }
        if (status == IncidentStatus.CLOSED || status == IncidentStatus.RESOLVED) {
            throw new IllegalStateException();
        }
        this.assignee = user;
    }

    public void startProgress() {
        if (status != IncidentStatus.OPEN) {
            throw new IllegalStateException();
        }
        this.status = IncidentStatus.IN_PROGRESS;
    }

    public void resolve() {
        if (status != IncidentStatus.IN_PROGRESS) {
            throw new IllegalStateException();
        }
        this.status = IncidentStatus.RESOLVED;
    }

    public void close() {
        if (this.status != IncidentStatus.RESOLVED) {
            throw new IllegalStateException();
        }
        this.status = IncidentStatus.CLOSED;
    }
}
