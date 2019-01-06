package net.learning.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aaioanei on 1/23/2017.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}