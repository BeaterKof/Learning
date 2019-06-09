package net.learning.java.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SimpleCalculator {

    public int add(int x, int y) {
        System.out.println("inside add");
        return x+y;
    }

    public int subtract(int x, int y) {
        System.out.println("inside subtract");
        return x-y;
    }

}
