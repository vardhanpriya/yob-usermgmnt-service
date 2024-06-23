package com.yob.usermgmnt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "USER_AUDIT")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserAudit implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;


    private String mobileNumber;

    private String appName;

    private Boolean journeyCompleted= false;

    private String emailId;

    private String dob;

    private String ucic;

    private String remark;

    private String droppedReason;

    private String alternateMobileNumber;


    private String customerName;


    private String  journeyCreatedDate;


    private Integer panValidationCount =0;


    private Integer emailValidationCount = 0;


    private String journeyCompletedDate;


    private Boolean resumeMailSent = false;


    private Boolean eligibleForResume =false;


    private String leadId;


    private String journeyUpdatedDate;

}
