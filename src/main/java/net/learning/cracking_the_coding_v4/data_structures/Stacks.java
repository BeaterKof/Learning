package net.learning.cracking_the_coding_v4.data_structures;

/*
    1.Three stacks using an array. TODO: another approach
    2.
 */


import java.util.*;
import java.util.stream.Collectors;

public class Stacks {

    public static void main(String[] args) {



    }

}

class TripleStack {
    private int[] arr;
    private int[] stackElements = {0, 0, 0};
    private int stackSize;

    public TripleStack(int stackSize) {
        arr = new int[stackSize * 3];
        this.stackSize = stackSize;
    }

    public void put(int stackNumber, int value) {
        if (stackNumber > 2) throw new IllegalArgumentException();

        if (stackElements[stackNumber] >= stackSize - 1) {
            throw new IndexOutOfBoundsException("Stack is full!");
        }

        arr[stackNumber * stackSize + stackElements[stackNumber]] = value;
        stackElements[stackNumber]++;
    }

    public void printStacks() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Stack " + i + ": ");
            for (int j = 0; j < stackElements[i]; j++) {
                System.out.print(arr[j + (i * stackSize)] + " ");
            }
            System.out.println();
        }
    }

    public int pop(int stackNumber) {
        int val = arr[stackNumber * stackSize + stackElements[stackNumber]];
        arr[stackNumber * stackSize + stackElements[stackNumber]] = 0;
        stackElements[stackNumber]--;
        return val;
    }

    public int[] getArr() {
        return arr;
    }

    static void run() {
        TripleStack stack = new TripleStack(10);
        stack.put(0, 1);
        stack.put(0, 2);
        stack.put(0, 3);
        stack.put(0, 4);
        stack.put(0, 5);
        stack.put(0, 6);

        stack.put(1, 3);
        stack.put(1, 3);

        stack.put(2, 9);

        stack.printStacks();

        System.out.println("popped: " + stack.pop(0));
        System.out.println("popped: " + stack.pop(0));
        System.out.println("popped: " + stack.pop(0));
        System.out.println("popped: " + stack.pop(0));

        stack.printStacks();

        System.out.println();

        int[] a = stack.getArr();
        System.out.println("Real array:");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

class TowersOfHanoi {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    Stack<Integer> stack3 = new Stack<>();

    public TowersOfHanoi(List<Integer> list) {
        Collections.sort(list);
        Collections.reverse(list);
        for(int i : list) {
            stack1.push(i);
        }
    }

    public void resolve() {
        while(!stack1.empty()) {
            int val1 = stack1.pop();
            stack2.push(val1);

        }
    }
}