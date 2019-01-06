package net.learning.java.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    App that wants to generate random numbers in paralel and when all numbers are generated, to do an arithmetic mean.
 */
public class CyclicBarrierExample {
    public static final int NUMBER_OF_WORKERS = 10;
    public static List<Integer> numbers = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        // adds random values to list
        Runnable generatorThread = () -> {
            Random rnd = new Random();
            for(int i=0; i<10; i++) {
                int val = rnd.nextInt(10);
                numbers.add(val);
                System.out.println("Thread: " + Thread.currentThread().getName() + " generating value: " + val);
            }
        };

        // generates arithmetic mean
        Runnable aggregatorThread = () -> {
            int size = numbers.size();
            int sum = numbers.stream().mapToInt(Integer::intValue).sum();
            System.out.println((double)sum/size);
        };

        CyclicBarrier cyclicBarrier = new CyclicBarrier(NUMBER_OF_WORKERS, generatorThread);

        for(int i=0; i<NUMBER_OF_WORKERS; i++) {
            Thread worker = new Thread(generatorThread);
            worker.setName("Thread " + i);
            worker.start();
        }


        aggregatorThread.run();

    }
}
