package com.pradip.emailAndMessageSender;


public class SmsRequest {
    private String to;
    private String message;
    // Getters and Setters
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    // Constructor
    public SmsRequest(String to, String message) {
        this.to = to;
        this.message = message;
    }
    // Default constructor
    public SmsRequest() {
    }
    // toString method
    @Override
    public String toString() {
        return "SmsRequest{" +
                "to='" + to + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
// This class is a simple data transfer object (DTO) that contains the recipient's phone number and the message to be sent.
