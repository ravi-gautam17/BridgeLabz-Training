package com.day10.avl.ticketbooking;

public class EventNode {

	int startTime;
    String eventName;
    int height;
    EventNode left, right;

    EventNode(int startTime, String eventName) {
        this.startTime = startTime;
        this.eventName = eventName;
        this.height = 1;
    }
}