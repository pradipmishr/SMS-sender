package com.pradip.emailAndMessageSender;

import com.pradip.emailAndMessageSender.Config.TwilioConfig;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import org.springframework.stereotype.Service;

@Service
public class SmsService {
    private final TwilioConfig twilioConfig;

    SmsService(TwilioConfig twilioConfig) {
        this.twilioConfig = twilioConfig;
    }

    public void sendSms(SmsRequest smsRequest) {
        Message.creator(
                new PhoneNumber(smsRequest.getTo()),
                new PhoneNumber(twilioConfig.getPhoneNumber()),
                smsRequest.getMessage()
        ).create();
    }
}

