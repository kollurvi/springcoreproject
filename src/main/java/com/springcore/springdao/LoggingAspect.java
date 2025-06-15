package com.springcore.springdao;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Log4j2
@EnableAspectJAutoProxy
@Aspect
@Configuration
public class LoggingAspect {

    //@Before("pointcut()")
    public void  beforeAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("Before advice for the method name:{} and args:{}", methodName, args[0]);
    }

    //@AfterReturning(pointcut = "pointcut()", returning = "object")
    public void afterReturning(JoinPoint joinPoint, Object object){
        log.info("After returning advice, method name:{} and response:{}", joinPoint.getSignature().getName(), object);
    }

    @Pointcut("execution(* com.springcore.springdao.UserDAOImpl.*(..))")
    public void pointcut(){}

    //@AfterThrowing(pointcut = "pointcut()", throwing = "exception")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception exception){
        log.info("After throwing advice, method name:{} and exception", joinPoint.getSignature().getName(), exception);
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args=joinPoint.getArgs();
        log.info("Around advice , before execute the method name:{} and args:{}", joinPoint.getSignature().getName(), args[0]);
        Object object = joinPoint.proceed();
        log.info("Around advice after execute the method, method name:{} and response:{}", joinPoint.getSignature().getName(), object);
    }
}
