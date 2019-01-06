package net.learning.java.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

// The latch instance is passed to all the threads.
// Calling cdl.await() will make the current thread wait for all the threads to finish.
public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {

        List<String> outputScraper = Collections.synchronizedList(new ArrayList<>());
        CountDownLatch countDownLatch = new CountDownLatch(5);
        CountDownLatch countDownLatch2 = new CountDownLatch(5);
        List<Thread> workers = Stream
                .generate(() -> new Thread(new Worker(outputScraper, countDownLatch,0,5, null)))
                .limit(5)
                .collect(toList());

        List<Thread> workers2 = Stream
                .generate(() -> new Thread(new Worker(outputScraper, countDownLatch2, 5, 10, countDownLatch)))
                .limit(5)
                .collect(toList());

        workers.forEach(Thread::start);
        workers2.forEach(Thread::start);
        countDownLatch.await();
        countDownLatch2.await();
        outputScraper.add("Latches released");
        outputScraper.stream().forEach(System.out::println);
    }
}

class Worker implements Runnable {
    private List<String> outputScraper;
    private CountDownLatch countDownLatch;
    private CountDownLatch countDownLatch2;
    private int start;
    private int finish;

    public Worker(List<String> outputScraper, CountDownLatch countDownLatch, int start, int finish, CountDownLatch countDownLatch2) {
        this.outputScraper = outputScraper;
        this.countDownLatch = countDownLatch;
        this.start = start;
        this.finish = finish;
        this.countDownLatch2 = countDownLatch2;
    }

    @Override
    public void run() {
        try {
            if(countDownLatch2!=null) {
                countDownLatch2.await();
            }
            for(int i=start; i<finish; i++) {
                Thread.sleep(500);
                System.out.println("Worker " + Thread.currentThread().getName() + " says - " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        outputScraper.add("Counted down");
        countDownLatch.countDown();

    }
}