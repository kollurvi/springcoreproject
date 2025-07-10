package com.springcore.springdao;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Log4j2
public class TrackAuditAspect {

    @Before("@annotation(trackAudit)")
    public void trackingAudit(JoinPoint joinPoint, TrackAudit trackAudit) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String action = trackAudit.doAction();

        log.info("####Tracking Audit: Action: {}, Method: {}, Arguments: {}####", action, methodName, Arrays.toString(args));
    }
}

