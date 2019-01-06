package net.learning.design_patterns.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/26/15
 * Time: 11:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Volt {
    private int volts;

    public Volt(int v){
        this.volts=v;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}
