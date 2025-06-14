package com.springcore.springdao;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Log4j2
@EnableAspectJAutoProxy
@Aspect
@Configuration
public class LoggingAspect {

    @Before("execution(* com.springcore.springdao.UserDAOImpl.*(..))")
    public void  beforeAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("Before advice for the method name:{} and args:{}", methodName, args[0]);
    }
}
