package com.yob.usermgmnt.dto;

import com.yob.usermgmnt.constants.Constant;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class CommonResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Status status = Status.SUCCESS;
    private String message;
    private String responseCd = Constant.SUCCESS_CD;
}
