package com.yob.usermgmnt.dto;

import lombok.Data;

@Data
public class ValidateMobileOtpRequest {

    private String otp;
    private String transactionId;
    private String mobileNumber;

}
