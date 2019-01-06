package net.learning.design_patterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/17/15
 * Time: 10:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}

// used if the singleton class does not use a lot of resurce