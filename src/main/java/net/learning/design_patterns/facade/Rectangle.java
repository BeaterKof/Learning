package net.learning.design_patterns.facade;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 12/3/15
 * Time: 4:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rectangle implements Shape {
    @Override
    public void draw(){
        System.out.println("Rectangle::draw");
    }
}
