package net.learning.java.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// TODO: deadlocks
// app to print a list from 2 threads, one by one
public class ReentrantLockExample {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> listA = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> list = new CopyOnWriteArrayList<>(listA);
        Lock locker = new ReentrantLock();

        Printer p1 = new Printer(list, locker);
        Printer p2 = new Printer(list, locker);

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        System.out.println("Program exit.");
    }
}

class Printer extends Thread {

    private List<Integer> list;
    private final Lock locker;

    public Printer(List<Integer> list, Lock locker) {
        this.list = list;
        this.locker = locker;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(300);
                locker.lock();
                if(list.size() < 1)
                    break;
                System.out.println(Thread.currentThread().getName() + " printed: " + list.get(0));
                list.remove(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                locker.unlock();
            }
        }
        System.out.println(Thread.currentThread().getName() + " ended.");
    }
}

