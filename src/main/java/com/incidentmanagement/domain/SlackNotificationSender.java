package com.incidentmanagement.domain;

public class SlackNotificationSender implements NotificationSender{
    @Override
    public void send(String message) {
        System.out.println("SLACK: "+ message);
    }
}
