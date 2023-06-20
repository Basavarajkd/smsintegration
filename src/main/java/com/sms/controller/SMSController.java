package com.sms.controller;

import com.sms.payload.SMSRequest;
import com.sms.service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SMSController {

    private final SMSService smsService;

    @Autowired
    public SMSController(SMSService smsService) {
        this.smsService = smsService;
    }

    @PostMapping("/sms")
    public void sendSMS(@RequestBody SMSRequest request) {
        smsService.sendSMS(request.getToPhoneNumber(), request.getMessage());
    }
}

