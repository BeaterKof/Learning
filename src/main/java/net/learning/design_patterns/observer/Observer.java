package net.learning.design_patterns.observer;

/**
 * Created by aaioanei on 1/23/2017.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}