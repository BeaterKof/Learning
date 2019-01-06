package net.learning.design_patterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/17/15
 * Time: 9:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class Singleton {
    private static Singleton singleton = new Singleton( );

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private Singleton(){ }

    /* Static 'instance' method */
    public static Singleton getInstance( ) {
        return singleton;
    }
    /* Other methods protected by singleton-ness */
    protected static void demoMethod( ) {
        System.out.println("demoMethod for singleton");
    }
}
