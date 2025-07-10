package com.springcore.springdao;

import com.springcore.springdao.LogExecutionTime;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Log4j2
public class ExecutionTimeAspect {

    @Around("@annotation(logExecutionTime)")
    public Object logExecution(ProceedingJoinPoint joinPoint, LogExecutionTime logExecutionTime) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        if (logExecutionTime.logArgs()) {
            log.info("----Executing method: {}----", methodName);
            log.info("----Arguments: {}----", Arrays.toString(args));
         }

        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed(); // actual method call
        long duration = System.currentTimeMillis() - startTime;

        if(logExecutionTime.logResult()) {
            log.info("----Result: {}----", result);
            log.info("----Execution time for method [{}]: {} ms----", methodName, duration);
        }
        return result;
    }
}

