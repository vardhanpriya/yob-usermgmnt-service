package com.yob.usermgmnt.service;

import com.yob.usermgmnt.Exception.CustomBusinessValidationException;
import com.yob.usermgmnt.dto.UserDetails;
import com.yob.usermgmnt.dto.ValidateMobileOtpRequest;
import com.yob.usermgmnt.dto.VerifyMobileOtpRequest;
import com.yob.usermgmnt.dto.VerifyMobileResponse;

public interface MobileVerificationService {


    public VerifyMobileResponse generateMobileOtp(VerifyMobileOtpRequest request) throws CustomBusinessValidationException;

    public UserDetails validateMobileOtp(ValidateMobileOtpRequest request);
}
