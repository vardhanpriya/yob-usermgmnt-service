package com.yob.usermgmnt.repository;

import com.yob.usermgmnt.entity.UserAudit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuditRepo extends JpaRepository<UserAudit,Long> {

    UserAudit findByMobileNumberAndAppName(String mobileNumber,String appName);
}
