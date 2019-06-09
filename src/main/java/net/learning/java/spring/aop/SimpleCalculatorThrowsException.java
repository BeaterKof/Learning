package net.learning.java.spring.aop;

public class SimpleCalculatorThrowsException {

    public int add(int x,int y) {
        System.out.println("inside Add");
        throw new RuntimeException();
    }
}
