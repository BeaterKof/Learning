package net.learning.java.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Configuration
public class MyBeforeAspect {

    @Pointcut("execution(* net.learning.java.spring.aop.SimpleCalculator.*(..))")
    public void pointcutName() {}

    @Before("pointcutName()") //applying pointcut on before advice
    public void myAdvice(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("my before advice ->  adding " + args[0] + " and " + args[1] );
    }
}
