package net.learning.design_patterns.builder;

/**
 * created by: andrei
 * date: 19.11.2018
 **/
/*
    Pattern used to create objects from a bunch of other objects.
    Separate the construction of a complex object from its representation so that the same construction process can create different representations.

    Use it:
    -when you want to build an object made up from other objects
    -when you want the creation of these parts to be independent of the main object
    -hide the creation of the parts from client so both are't dependent
    -the builder knwos the specifics and nobody else
 */

public class Main {
    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
        Computer comp2 = new Computer.ComputerBuilder("222","32").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();

        System.out.println(comp);
        System.out.println(comp2);
    }
}
