package net.learning.design_patterns.abstract_factory;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/26/15
 * Time: 5:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class LaptopFactory implements ComputerAbstractFactory {
    private int Ram;
    private int Hdd;

    public LaptopFactory(int ram,int hdd){
        this.Ram = ram;
        this.Hdd = hdd;
    }

    public Computer createComputer(){
        return new Laptop(Ram,Hdd);
    }
}
