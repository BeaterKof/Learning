package net.learning.design_patterns.facade;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 12/3/15
 * Time: 5:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
