package net.learning.design_patterns.observer;

/**
 * created by: andrei
 * date: 19.11.2018
 **/

/*
    Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified,
    its depenedent objects are to be notified automatically.
    Observer pattern falls under behavioral pattern category.

    Observer pattern uses three actor classes. Subject, Observer and Client.
    Subject is an object having methods to attach and detach observers to a client object.
 */
public class Main {

    public static void main(String[] args){

        Subject subject = new Subject();
        new ObserverImpl(subject);
        new ObserverImpl(subject);
        new ObserverImpl(subject);

        subject.setState("Hola");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        subject.setState("End");
    }

}