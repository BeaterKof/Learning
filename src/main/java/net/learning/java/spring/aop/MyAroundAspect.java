package net.learning.java.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAroundAspect {
    @Pointcut("execution(* com.kb.SimpleCalculator.*(..))")
    public void pointcutName(){}

    @Around("pointcutName()")//applying pointcut on before advice
    public Object myAdvice(ProceedingJoinPoint jp){
        System.out.println("Around -- Before the method "+jp.getSignature().getName()+" execution");
        Object[] args=null;
        Object value=null;
        try {
            args=jp.getArgs();
            if((Integer)args[0] == 10){
                value= jp.proceed();
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("Around -- After the method "+jp.getSignature().getName()+" execution");
        return value;
    }
}
