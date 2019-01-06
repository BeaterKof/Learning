package net.learning.design_patterns.abstract_factory;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/26/15
 * Time: 5:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PCFactory implements ComputerAbstractFactory {
    private int Hdd;
    private int Ram;
    
    public PCFactory(int ram,int hdd){
        this.Hdd = hdd;
        this.Ram = ram;
    }
    
    public Computer createComputer(){
        return new PC(Ram,Hdd);
    }

}
