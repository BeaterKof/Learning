package net.learning.design_patterns.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/28/15
 * Time: 2:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Item {
    private String upcCode;
    private int price;

    public Item(String upc, int cost){
        this.upcCode=upc;
        this.price=cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }
}
