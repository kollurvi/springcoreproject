package com.springcore.springdao;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@Aspect
public class LoggingAspect {

    //@Before("pointcut()")
    public void beforeAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("**** Executing method: {} with arguments: {}", methodName, args);
    }

    //@After("pointcut()")
    public void afterAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        log.info("#### Method {} executed successfully", methodName);
    }

   // @AfterReturning(pointcut = "pointcut()", returning = "result")
    public void afterReturningAdvice(JoinPoint joinPoint, Object result){
        String methodName = joinPoint.getSignature().getName();
        log.info("**** Method {} returned successfully with result: {}", methodName, result);
    }

   // @AfterThrowing(pointcut = "pointcut()", throwing = "exception")
    public void afterThrowingAdvice(JoinPoint joinPoint, Throwable exception) {
        String methodName = joinPoint.getSignature().getName();
        log.error("**** Method {} threw an exception: {}", methodName, exception.getMessage());
    }

    @Around("pointcut()")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        log.info("**** Around advice: Before executing method: {}", methodName);

        Object result;
        try {
            result = proceedingJoinPoint.proceed();
            log.info("**** Around advice: After executing method: {}", methodName);
        } catch (Throwable throwable) {
            log.error("**** Around advice: Exception in method {}: {}", methodName, throwable.getMessage());
            throw throwable; // rethrow the exception
        }

        return result;
    }

    @Pointcut("execution(* com.springcore.springdao.UserDAOImpl.insertUser(..))")
    public void pointcut(){}
}
