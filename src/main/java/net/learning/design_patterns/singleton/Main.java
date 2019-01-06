package net.learning.design_patterns.singleton;

/**
 * created by: andrei
 * date: 19.11.2018
 **/

/*
    The singleton pattern is a software design pattern that restricts the instantiation of a class to one object.
     This is useful when exactly one object is needed to coordinate actions across the system.

    Singleton usage:
    -when exactly one object is needed to coordinate actions across the system.
    -Singletons can be extended into a factory. The object management behind the scenes is abstract so it's better maintainable and results in better code.
    -Singletons can be lazy loaded. Only when it is actually needed. That's very handy if the initialisation includes expensive resource loading or database connections.
    -in contrast to Static Classes, Singletons can be instantiated only when needed. (Static classes are loaded at runtime)

 */
public class Main {
    public static void main(String[] args){

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);


    }
}