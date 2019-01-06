package net.learning.design_patterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/26/15
 * Time: 3:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

}

// works fine in case of single threaded environment