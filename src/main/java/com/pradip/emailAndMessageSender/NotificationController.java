package com.pradip.emailAndMessageSender;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notify")
public class NotificationController {

    private final SmsService smsService;
    //private final EmailService emailService;

    NotificationController(SmsService smsService) {
        this.smsService = smsService;
    }


    @PostMapping("/sms")
    public ResponseEntity<String> sendSms(@RequestBody SmsRequest smsRequest) {
        smsService.sendSms(smsRequest);
        return ResponseEntity.ok("SMS sent successfully");
    }

//    @PostMapping("/email")
//    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest) {
//        emailService.sendEmail(emailRequest);
//        return ResponseEntity.ok("Email sent successfully");
//    }
}

