package com.yob.usermgmnt.dto;

import lombok.Data;

@Data
public class VerifyMobileOtpRequest {

    private String mobileNumber;
    private String appName;
    private String appId;
    private String otpText;

}
