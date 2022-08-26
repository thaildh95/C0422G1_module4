package com.book.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Aspect
@Component
public class LibraryAspect {

    private int count = 1;

    @AfterReturning(pointcut = "execution(* com.book.controller.LibraryController.*(..))", argNames = "joinPoint")
    public void infoProcessing(JoinPoint joinPoint) {
      String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.err.println("Method " + methodName + "đã chạy xong");
        System.err.println(args);
    }
}