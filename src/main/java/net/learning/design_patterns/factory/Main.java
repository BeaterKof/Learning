package net.learning.design_patterns.factory;

/**
 * created by: andrei
 * date: 19.11.2018
 **/

/*
    In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
    Factories and interfaces allow for a lot more long term flexibility. It allows for a more decoupled - and therefore more testable - design.

    Usage:
    -it allows you to introduce an Inversion of Control (IoC) container easily
    -it makes your code more testable as you can mock interfaces
    -it gives you a lot more flexibility when it comes time to change the application


 */
public class Main {
    public static void main(String[] args){

        Computer pc1 = ComputerFactory.getComputer("PC","128","250","3000");
        Computer ser1 = ComputerFactory.getComputer("Server","18","50","100");

        System.out.println(pc1);
        System.out.println(ser1);
    }
}