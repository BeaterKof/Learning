package net.learning.design_patterns.abstract_factory;

/**
 * created by: andrei
 * date: 19.11.2018
 **/
/*
    It's like a factory but everything is encapsulated.
    -allows you to create families of related objects without specifying a concrete class
    -use when you have many objects that can be added , or changed dynamically during runtime
    -you can model anything you can imagine and have those objects interact through common interfaces

    -Downside: things can get complicated
 */
public class Main {
    public static void main(String[] args){
        Computer pcFac1 = ComputerFactory.createComputer(new PCFactory(12,12));
        Computer lapFac1 = ComputerFactory.createComputer(new LaptopFactory(2,2));

        System.out.println(pcFac1);
        System.out.println(lapFac1);
    }
}

