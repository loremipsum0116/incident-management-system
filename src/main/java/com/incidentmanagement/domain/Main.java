package com.incidentmanagement.domain;

public class Main {

    public static void main(String[] args) {

        NotificationSender sender =
                new SlackNotificationSender();

        sender.send("Incident created");
    }
}