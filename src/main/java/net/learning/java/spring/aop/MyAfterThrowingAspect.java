package net.learning.java.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Pointcut;

public class MyAfterThrowingAspect {

    @Pointcut("execution(* com.kb.SimpleCalculatorThrowsException.*(..))")
    public void pointcutName(){}

    @AfterThrowing("pointcutName()")//applying pointcut on after throwing  //advice
    public void myadvice(JoinPoint jp)
    {
        System.out.println("my after throwing advice");
    }
}
