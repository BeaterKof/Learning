package net.learning.design_patterns.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/26/15
 * Time: 11:26 PM
 * To change this template use File | Settings | File Templates.
 */
public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
