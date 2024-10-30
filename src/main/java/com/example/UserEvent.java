package com.example;

import java.io.Serializable;

public class UserEvent implements Serializable {
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    private Long userId;
    private String eventType;

    // Constructor
    public UserEvent(Long userId, String eventType) {
        this.userId = userId;
        this.eventType = eventType;
    }

    // Getters and Setters
    // ...
}
