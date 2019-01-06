package net.learning.java.collections;

import java.util.*;

/**
 * created by: andrei
 * date: 19.11.2018
 **/
public class MainCollections {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        /*
            Set
            -no duplicate elements
            -at most one null element

            List
            -control over where in the list each element is inserted
            -allow multiple null and duplicates

            Queue
            -designed for holding elements prior to processing

         */

        /*
            ArrayList

            - uses a dynamic array for storing the elements.It extends AbstractList class and implements List interface.
            - can contain duplicate elements.
            - maintains insertion order.
            - is non synchronized.
            - allows random access because array works at the index basis.
            In Java ArrayList class, manipulation is slow because a lot of shifting needs to be occurred if
            any element is removed from the array list.
         */

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Iterator<Integer> itr = arrayList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }


        /*
                LinkedList

            - uses doubly linked list to store the elements. It extends the AbstractList class and implements List and
            Deque interfaces.
            - can contain duplicate elements.
            - maintains insertion order.
            - is non synchronized.
            In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
            Java LinkedList class can be used as list, stack or queue.
         */

        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        //iterator

        /*
                HashSet
                -fast
               - uses hashtable to store the elements.It extends AbstractSet class and implements Set interface.
               - contains unique elements only.
               - Difference between List and Set:
               - permits null elements
               - implements serializable

                List can contain duplicate elements whereas Set contains unique elements only.
         */

        HashSet<Integer> hs = new HashSet<Integer>();
        HashSet<Integer> hs2 = new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs2.add(4);
        System.out.println("Hash code 1 " + hs.contains(1));
        System.out.println("Hash code 2 " + hs2.hashCode());


        /*
               LinkedHashSet

               - contains unique elements only like HashSet. It extends HashSet class and implements Set interface.
               - maintains insertion order.
         */


        /*
               Java TreeSet class
               -fast sorting
               - contains unique elements only like HashSet. The TreeSet class implements NavigableSet
                    interface that extends the SortedSet interface.
               - maintains ascending order.
         */

        TreeSet<String> al1=new TreeSet<String>();
        al1.add("Ravi");
        al1.add("Vijay");
        al1.add("Ravi");

        //iterator

        /*
               Map

              - contains values based on the key i.e. key and value pair.Each pair is known as an entry
              - contains only unique elements.
         */

        /*
                HashMap class

                - contains values based on the key. It implements the Map interface and extends AbstractMap class.
                - contains only unique elements.
                - may have one null key and multiple null values.
                - maintains no order.
         */

        HashMap<Integer,String> hm=new HashMap<Integer,String>();

        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


        /*
                Sorting

                String class and Wrapper classes implements the Comparable interface
                So if you store the objects of string or wrapper classes, it will be Comparable.
         */

        ArrayList<String> al=new ArrayList<String>();
        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");

        Collections.sort(al);
        Iterator iter=al.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
