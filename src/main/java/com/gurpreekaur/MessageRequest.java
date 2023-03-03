package com.gurpreekaur;

import java.util.Objects;

public class MessageRequest {



    @Override
    public String toString() {
        return "message=" + message;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if (!(obj instanceof MessageRequest)) {
            return false;
        } else {
            MessageRequest other = (MessageRequest) obj;
            return Objects.equals(message, other.message);
        }
    }

    private final String message;

    public MessageRequest() {
        this.message = null;
    }

    public MessageRequest(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
