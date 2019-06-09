package net.learning.java.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAfterReturningAspect {

    @Pointcut("execution(* com.kb.SimpleCalculator.*(..))")
    public void pointcutName(){}

    @AfterReturning("pointcutName()")//applying pointcut on after returning //advice
    public void myadvice(JoinPoint jp)
    {
        System.out.println("my after returning advice");
    }
}
