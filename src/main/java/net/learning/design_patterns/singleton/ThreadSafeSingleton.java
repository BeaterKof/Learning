package net.learning.design_patterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/26/15
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
