package com.book.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LibraryAspect {

@AfterReturning(pointcut = "execution(* com.book.controller.LibraryController.*(..))")
    public void logInfoProcessing(Joinpoint joinpoint){
    String 
}
}
