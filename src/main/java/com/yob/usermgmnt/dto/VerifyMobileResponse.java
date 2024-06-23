package com.yob.usermgmnt.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class VerifyMobileResponse extends CommonResponse{

    private String refNum;
    private String mobileNumber;
    private boolean isPost = false;     // will check later
    private boolean isPost72 = false;
    private boolean eligibleForResume = false;
    private boolean isPostAccount = false;
}
