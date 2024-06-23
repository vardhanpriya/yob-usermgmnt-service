package com.yob.usermgmnt.service.impl;

import com.yob.usermgmnt.Exception.CustomBusinessValidationException;
import com.yob.usermgmnt.dto.UserDetails;
import com.yob.usermgmnt.dto.ValidateMobileOtpRequest;
import com.yob.usermgmnt.dto.VerifyMobileOtpRequest;
import com.yob.usermgmnt.dto.VerifyMobileResponse;
import com.yob.usermgmnt.service.MobileVerificationService;
import org.springframework.stereotype.Service;

@Service("mobileVerificationServiceImpl")
public class MobileVerificationServiceImpl implements MobileVerificationService {


    @Override
    public VerifyMobileResponse generateMobileOtp(VerifyMobileOtpRequest request) throws CustomBusinessValidationException {
        return null;
    }

    @Override
    public UserDetails validateMobileOtp(ValidateMobileOtpRequest request) {
        return null;
    }
}
