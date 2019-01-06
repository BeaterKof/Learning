package net.learning.design_patterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/26/15
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class BillPughSingleton {
    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.instance;
    }

}

//Notice the private inner static class that contains the instance of the singleton class.
// When the singleton class is loaded, SingletonHelper class is not loaded into memory and only
// when someone calls the getInstance method, this class gets loaded and creates the Singleton class instance.