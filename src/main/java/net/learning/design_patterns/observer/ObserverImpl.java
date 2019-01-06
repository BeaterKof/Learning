package net.learning.design_patterns.observer;

/**
 * Created by aaioanei on 1/23/2017.
 */
public class ObserverImpl extends Observer{

    public ObserverImpl(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Observer " + this.toString() + " -> new status: " + subject.getState());
    }
}
