package net.learning.design_patterns.composite;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/26/15
 * Time: 11:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color "+fillColor);
    }
}
