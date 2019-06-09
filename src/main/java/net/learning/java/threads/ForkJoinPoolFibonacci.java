package net.learning.java.threads;

import java.util.Arrays;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolFibonacci extends RecursiveTask<Integer> {

    Integer val;

    public ForkJoinPoolFibonacci(Integer val) {
        this.val = val;
    }

    @Override
    protected Integer compute() {
        if(val > 2) {
            ForkJoinPoolFibonacci subTask1 = new ForkJoinPoolFibonacci(val-1);
            ForkJoinPoolFibonacci subTask2 = new ForkJoinPoolFibonacci(val-2);
            return ForkJoinTask.invokeAll(Arrays.asList(subTask1, subTask2))
                    .stream()
                    .mapToInt(ForkJoinTask::join)
                    .sum();
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        ForkJoinPoolFibonacci fjpF = new ForkJoinPoolFibonacci(6);
        fjpF.fork();
        int result = fjpF.join();
        System.out.println(result);
    }
}
