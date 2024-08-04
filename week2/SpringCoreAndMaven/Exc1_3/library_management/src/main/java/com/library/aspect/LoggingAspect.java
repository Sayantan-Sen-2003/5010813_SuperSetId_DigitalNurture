package com.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.library.service.BookService.performService(..))")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("Starting method: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.library.service.BookService.performService(..))")
    public void logAfter(JoinPoint joinPoint) {
        logger.info("Finished method: " + joinPoint.getSignature().getName());
    }
}

