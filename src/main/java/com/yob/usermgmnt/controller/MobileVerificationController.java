package com.yob.usermgmnt.controller;

import com.yob.usermgmnt.Exception.BusinessValidationException;
import com.yob.usermgmnt.Exception.CustomBusinessValidationException;
import com.yob.usermgmnt.dto.VerifyMobileOtpRequest;
import com.yob.usermgmnt.dto.VerifyMobileResponse;
import com.yob.usermgmnt.service.MobileVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileVerificationController  {

    @Autowired
    @Qualifier("mobileVerificationServiceImpl")
    MobileVerificationService mobileVerificationService;

    @Autowired
    @Qualifier("mobileVerificationServiceImplForResume")
    MobileVerificationService mobileVerificationServiceForResumeJourney;


    /*
   /v1/mobile/verify

   /v1/mobile/validateOtp

   /v1/resume/mobile/verify

   /v1/resume/mobile/validateOtp
     */

    @PostMapping(path = "/v1/resume/mobile/verify",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<VerifyMobileResponse> verifyMobile(@RequestBody VerifyMobileOtpRequest request) throws CustomBusinessValidationException {
        VerifyMobileResponse response = mobileVerificationServiceForResumeJourney.generateMobileOtp(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
