package net.learning.design_patterns.abstract_factory;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/26/15
 * Time: 5:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class ComputerFactory {

    public static Computer createComputer(ComputerAbstractFactory caf) {
        return caf.createComputer();
    }
}
