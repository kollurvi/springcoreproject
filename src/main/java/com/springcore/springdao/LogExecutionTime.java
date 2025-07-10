package com.springcore.springdao;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
    boolean logArgs() default true; // Whether to log method arguments
    boolean logResult() default true; // Whether to log method result
}