package net.learning.design_patterns.factory;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/26/15
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}

/*
  Factory pattern provides approach to code for interface rather than implementation.
  Factory pattern removes the instantiation of actual implementation classes from client code, making it more robust,
  less coupled and easy to extend. For example, we can easily change PC class implementation because client program is
  unaware of this.
  Factory pattern provides abstraction between implementation and client classes through inheritance.
*/