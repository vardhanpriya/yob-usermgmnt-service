package com.yob.usermgmnt.Exception;

import lombok.Data;
import lombok.Setter;

import java.security.SecureRandom;



@Setter
public class CustomBusinessValidationException extends BusinessValidationException{

    public static final long serialVersioUID = 1L;
    private String errorMessage;

    public CustomBusinessValidationException(String cd, String defaultCd, String errorMessage) {
        super(cd, defaultCd);
        this.errorMessage = errorMessage;
    }
}
