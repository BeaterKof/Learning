package net.learning.design_patterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/17/15
 * Time: 9:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class ClassicSingleton {

    private static ClassicSingleton instance = null;
    private ClassicSingleton() {
        // Exists only to defeat instantiation.
    }
    public static ClassicSingleton getInstance() {
        if(instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }
}
