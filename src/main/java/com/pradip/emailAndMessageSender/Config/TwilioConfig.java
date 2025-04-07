package com.pradip.emailAndMessageSender.Config;

import com.twilio.Twilio;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
    @ConfigurationProperties(prefix = "twilio")
    public class TwilioConfig {
        private String accountSid;
        private String authToken;
        private String phoneNumber;

        public String getAccountSid() {
            return accountSid;
        }
        public void setAccountSid(String accountSid) {
            this.accountSid = accountSid;
        }
        public String getAuthToken() {
            return authToken;
        }
        public void setAuthToken(String authToken) {
            this.authToken = authToken;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
        // Constructor

        // Default constructor
        public TwilioConfig() {
        }

        @PostConstruct
        public void initTwilio() {
            System.out.println("Twilio SID Loaded: " + accountSid); // Optional debug
            System.out.println("DEBUG: " + accountSid + ", " + authToken + ", " + phoneNumber);

            Twilio.init(accountSid, authToken);
        }
    }

// This class is responsible for initializing the Twilio client with the account SID and auth token.
