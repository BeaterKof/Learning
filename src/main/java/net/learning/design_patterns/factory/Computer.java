package net.learning.design_patterns.factory;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/26/15
 * Time: 4:16 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Computer{
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return this.getClass().toString() + " -> RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU: "+this.getCPU();
    }
}
