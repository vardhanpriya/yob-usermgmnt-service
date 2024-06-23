package com.yob.usermgmnt.Exception;

import lombok.Getter;

@Getter
public class BusinessValidationException extends Exception{

    public static final long serialVersioUID = 1L;

    private final String cd;
    private final String defaultCd;



    public BusinessValidationException(String cd, String defaultCd) {
        super(cd);
        this.cd = cd;
        this.defaultCd = defaultCd;
    }
}
