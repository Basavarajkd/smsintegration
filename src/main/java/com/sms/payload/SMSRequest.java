package com.sms.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SMSRequest {

    private String toPhoneNumber;
    private String message;

    // Getters and setters
}

