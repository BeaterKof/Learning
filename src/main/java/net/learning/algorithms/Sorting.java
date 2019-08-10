package net.learning.algorithms;

/**
 * created by: andrei
 * date: 19.11.2018
 **/
public class Sorting {

    public static void main(String[] args){
        int[] a = { 5, 4, 1, 8, 22, 7, 6};
//        int[] b = { 5, 4, 1, 8, 22, 7, 6};

        printArray(a);
        //quickSort(a);
        printArray(a);

    }

    public static void printArray(int[] a){
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /*
    BubbleSort
    -> Go through the array and compare each element with the next one. Switch if first element is bigger than the next.
     */

    public static void bubbleSort(int[] a){
        int temp = 0;
        for(int i = a.length - 1; i > 1; i--){
            for(int j=0; j< a.length -1; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void swapValues(int[] a, int n, int m){
        int temp = a[n];
        a[n] = a[m];
        a[m] = temp;
    }

    /*
     InsertionSort -> Compare with the next and if the next is smaller than swap values
     and compare the swaped value with the smaller values.
     */

    public static void insertionSort(int[] myArray){

        for(int i = 1; i < myArray.length; i++){

            int j = i;
            int toInsert = myArray[i];

            while((j>0) && (myArray[j-1] > toInsert)){
                myArray[j] = myArray[j-1];
                j--;
            }

            myArray[j] = toInsert;
        }
    }

    /*
    selectionSort -> Check for the smalles element and replace the first element with it.
     */

    public static void selectionSort(int[] a){

        for(int x = 0; x < a.length; x++){
            int minimum = x;

            for(int y = x; y < a.length; y++){
                if(a[minimum] > a[y]){
                    minimum = y;
                }
            }
            swapValues(a, x, minimum);
        }
    }

     /*
        Quick sort -> We have a wall to the left (wall = -1). The pivot is the outmost right element.
                  Compare the pivot to all values from left to right and switch the smaller element with the first
                  right of the wall and move the wall (wall ++).
     */

    public static void quickSort(int[] a, int wall, int sup){
        wall = wall -1;

        while(wall < a.length-1){
            for(int i= wall + 1; i < a.length-1; i++){
                if(a[a.length-1] > a[i]){
                    int temp = a[wall + 1];
                    a[wall + 1] = a[i];
                    a[i] = temp;
                    wall++;
                }
            }
            int temp = a[wall + 1];
            a[wall+1] = a[a.length-1];
            a[a.length - 1] = temp;
            wall++;
        }
    }


    /*
    BubbleSort
    -> Go through the array and compare each element with the next one. Switch if first element is bigger than the next.
    Av - good only for small sized data and easy to implement
    Da - n_2 in all cases like selection

    InsertionSort -> Compare with the next and if the next is smaller than swap values
     and compare the swaped value with the smaller values.
     Av: - faster than bubble/selection
         - shines on partially sorted arrays
         - stable
         - used in conjunction with MergeSort for stability
         - writes are quite minimal

    SelectionSort -> Check for the smalles element and replace the first element with it.

    Merge sort -> Divide the array into pieces by one and compare two by two. Than compare two by two by comparing the first
                    element from the first couple with each value from the second couple.

    Quick sort
    -> similar to selection sort
    -> pick a pivot element and all the smaller elements go before it, all the bigger elements go after it
    -> switch first bigger from left subarray with first smaller from right subarray
    -> move to subarrays and repeat
    AV: - has average time complexity of Θ(n log n);
        - can be implemented with space complexity of Θ(log n)
    DEZ:  - not stable
          - poor pivot choice could lead to O(n^2) complexity

    Shell sort
    -> improves insertion sort by comparing with elements that are a distance apart(gap) (rather then adjacent)
    -> Divide the array in two and compare each element by indexes. Repeat. (based on insertion sort)
    -> its complexity depends on the gap sequence

    Heap sort
    -> build heap (sorted tree) and create max head and make the same changes in the array
    -> used instead of merge sort only when there is lesser space available

    Bucket sort
    -> its a non-comparison sorting alg
    -> works like a map (uses insertion sort for each bucket)
    -> works well in better parallelism
    DEZ:
    - you can't apply it to all data
    - you need a good bucketing scheme

    Radix sort
    -> only used to sort numbers
    -> it sorts numbers by grouping in buckets by digits

        COMPLEXITIES:   best       worst

        Bubble sort      n         n^{2}
        Insertion sort   n         n^(2)
        Selection sort   n^(2)     n^(2)
        Merge sort       nlog(n)   nlog(n)
        Shell sort       nlog(n)   nlog2(n)
        Quick sort       nlog(n)   n^(2)
        Heap sort        nlog(n)   nlog(n)


    -In place sorting -> does not utilize an auxiliary data structure.
    -Stable sort -> maintains a relative order of records with equal keys.
    -Adaptive sort -> takes advantage of existing order in its input.



        WHEN TO USE SORTING:
        Quick sort: When you don't need a stable sort and average case performance matters more than worst case performance.
        A quick sort is O(N log N) on average, O(N^2) in the worst case. A good implementation uses O(log N) auxiliary
        storage in the form of stack space for recursion.

        Merge sort: When you need a stable, O(N log N) sort, this is about your only option. The only downsides to it
         are that it uses O(N) auxiliary space and has a slightly larger constant than a quick sort.
         There are some in-place merge sorts, but AFAIK they are all either not stable or worse than O(N log N).
         Even the O(N log N) in place sorts have so much larger a constant than the plain old merge sort that they're
          more theoretical curiosities than useful algorithms.

        Heap sort: When you don't need a stable sort and you care more about worst case performance than average case
        performance. It's guaranteed to be O(N log N), and uses O(1) auxiliary space, meaning that you won't
        unexpectedly run out of heap or stack space on very large inputs.

        Introsort: This is a quick sort that switches to a heap sort after a certain recursion depth to get around quick
         sort's O(N^2) worst case. It's almost always better than a plain old quick sort, since you get the average
         case of a quick sort, with guaranteed O(N log N) performance. Probably the only reason to use a heap sort
         instead of this is in severely memory constrained systems where O(log N) stack space is practically significant.

        Insertion sort: When N is guaranteed to be small, including as the base case of a quick sort or merge sort.
        While this is O(N^2), it has a very small constant and is a stable sort.

        Bubble sort, selection sort: When you're doing something quick and dirty and for some reason you can't just
         use the standard library's sorting algorithm. The only advantage these have over insertion sort is
         being slightly easier to implement.

        Non-comparison sorts: Under some fairly limited conditions it's possible to break the O(N log N) barrier and
        sort in O(N). Here are some cases where that's worth a try:

        Counting sort: When you are sorting integers with a limited range.

        Radix sort: When log(N) is significantly larger than K, where K is the number of radix digits.

        Bucket sort: When you can guarantee that your input is approximately uniformly distributed.
     */
}
