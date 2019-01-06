package net.learning.design_patterns.abstract_factory;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/26/15
 * Time: 5:21 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Computer {
    public int Ram;
    public int Hdd;

    public abstract int getRam();
    public abstract int getHdd();

    public String toString() {
        return "Ram =" + this.Ram;
    }
}
