package com.sms.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class SMSService {

    @Value("${twilio.accountSid}")
    private String accountSid;

    @Value("${twilio.authToken}")
    private String authToken;

    @Value("${twilio.phoneNumber}")
    private String twilioPhoneNumber;

    public void sendSMS(String toPhoneNumber, String message) {
        Twilio.init(accountSid, authToken);

        PhoneNumber to = new PhoneNumber(toPhoneNumber);
        PhoneNumber from = new PhoneNumber("+14175383632");

        Message.creator(to, from, message).create();
    }
}
