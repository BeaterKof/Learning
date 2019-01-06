package net.learning.design_patterns.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/26/15
 * Time: 11:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
