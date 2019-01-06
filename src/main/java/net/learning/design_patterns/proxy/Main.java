package net.learning.design_patterns.proxy;

/**
 * created by: andrei
 * date: 19.11.2018
 **/

/*
    Used to provide a class which will limit access to another class.

    The purpose of using this pattern is security reasons, because an Object is intensive to create,
    or is accessed from a remote location.
 */
public class Main {

    public static void main(String[] args){

        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();

    }
}
