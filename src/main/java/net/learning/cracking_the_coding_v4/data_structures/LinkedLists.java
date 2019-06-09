package net.learning.cracking_the_coding_v4.data_structures;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class LinkedLists {

    public static void main(String[] args) {
        Node n = Node.getLinkedListFromCollection(Arrays.asList(0, 1, 2, 1, 3, 4, 5, 6, 6));
        n.showLinkedList();
        n.removeDoubles();
        n.showLinkedList();
    }

}

class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {

        Node end = new Node(d);

        Node n = this;

        while (n.next != null) {
            n = n.next;
        }

        n.next = end;
    }

    static Node getLinkedListFromCollection(Collection<Integer> collection) {
        Node head;
        Node n;
        if (collection == null) return null;
        Iterator<Integer> iter = collection.iterator();
        if (iter.hasNext()) head = n = new Node(iter.next());
        else return null;
        while (iter.hasNext()) {
            n.next = new Node(iter.next());
            n = n.next;
        }
        return head;
    }

    void showLinkedList() {
        System.out.println(data);
        Node n = this;
        while (n.next != null) {
            System.out.println(n.next.data);
            n = n.next;
        }
    }

    void removeDoubles() {
        Node head = this;
        Node tail;

        while (head != null && head.next !=null) {
            Node n = head;

            do {
                if (n.next.data == head.data) {
                    n.next = n.next.next;
                    System.out.println("found duplicate");
                }
                n = n.next;
            } while (n != null && n.next != null);

            head = head.next;
        }
    }
}