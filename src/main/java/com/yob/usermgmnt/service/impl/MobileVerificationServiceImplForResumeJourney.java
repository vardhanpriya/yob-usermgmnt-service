package com.yob.usermgmnt.service.impl;


import com.yob.usermgmnt.Exception.CustomBusinessValidationException;
import com.yob.usermgmnt.dto.UserDetails;
import com.yob.usermgmnt.dto.ValidateMobileOtpRequest;
import com.yob.usermgmnt.dto.VerifyMobileOtpRequest;
import com.yob.usermgmnt.dto.VerifyMobileResponse;
import com.yob.usermgmnt.entity.UserAudit;
import com.yob.usermgmnt.repository.UserAuditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Objects;

@Service("mobileVerificationServiceImplForResume")
public class MobileVerificationServiceImplForResumeJourney extends  MobileVerificationServiceImpl{

    @Autowired
    private UserAuditRepo userAuditRepo;


    @Override
    public VerifyMobileResponse generateMobileOtp(VerifyMobileOtpRequest request) throws CustomBusinessValidationException {

        UserAudit entity = userAuditRepo.findByMobileNumberAndAppName(request.getMobileNumber(), request.getAppName());
        if(Objects.isNull(entity)){
            System.out.println("Entity is empty");
        }

        return new VerifyMobileResponse();
    }

    @Override
    public UserDetails validateMobileOtp(ValidateMobileOtpRequest request) {
        return new UserDetails();
    }
}
