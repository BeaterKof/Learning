package net.learning.java.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdConsWithBlockingQueue {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        Thread prod = new Producer(queue);
        Thread cons = new Consumer(queue);

        prod.start();
        cons.start();

        try {
            prod.join();
            cons.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer extends Thread {
    BlockingQueue<String> messageQueue;

    public Producer(BlockingQueue<String> messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                messageQueue.put("Message " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    BlockingQueue<String> messageQueue;

    public Consumer(BlockingQueue<String> messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = messageQueue.take();
                System.out.println("Consumer printed: " + message);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}