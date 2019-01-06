package net.learning.design_patterns.abstract_factory;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/26/15
 * Time: 5:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class PC extends Computer{
    public PC(int ram,int hdd){
        this.Hdd = hdd;
        this.Ram = ram;
    }
    @Override
    public int getRam(){
        return Ram;
    };

    @Override
    public int getHdd(){
        return Hdd;
    };

}
