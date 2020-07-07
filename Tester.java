
import datastructures.stack.*;
import datastructures.linkedlists.*;
import datastructures.queue.*;
import sorting.sort;
public class Tester {
    public static void main(String[] args) {
        StackArray<Integer> sk = new StackArray<Integer>();
        sk.push(5);
        //System.out.println(sk.toString());

        LinkedList<Integer> ll = new LinkedList<Integer>();
        
        ll.insertBack(5);
        ll.insertBack(20);
        ll.insertBack(-24);
        ll.insertFront(3);
        
        //System.out.println(ll.toString());

        QueueLinked<Integer> ql = new QueueLinked<Integer>();
        ql.enqueue(5);
        ql.enqueue(3);
        ql.enqueue(10);
        ql.enqueue(15);
        ql.enqueue(30);
        ql.dequeue();
        ql.dequeue();
        ql.dequeue();
        //System.out.println(ql.toString());


        sort ss = new sort();
        int[] myarray = new int[]{43,23,12,5,9,90,4,1,0,6,43,91,45,65,12,34};
        System.out.println("\n\t   Collection of sorting algorithms\n");
        System.out.println("\n\t\t   selection sort!");
        System.out.println(printArray(myarray));
        ss.selectionSort(myarray);

        
        myarray = new int[]{43,23,12,5,9,90,4,1,0,6,43,91,45,65,12,34};
        System.out.println("\n\t\t   bubble sort!");
        System.out.println(printArray(myarray));
        ss.bubbleSort(myarray);

        myarray = new int[]{43,23,12,5,9,90,4,1,0,6,43,91,45,65,12,34};
        System.out.println("\t\t   insertion sort!");
        System.out.println(printArray(myarray));
        ss.insertionSort(myarray);

        myarray = new int[]{43,23,12,5,9,90,4,1,0,6,43,91,45,65,12,34};
        System.out.println("\n\t\t   merge sort!");
        System.out.println(printArray(myarray));
        ss.mergeSort(myarray);

        myarray = new int[]{43,23,12,5,9,90,4,1,0,6,43,91,45,65,12,34};
        System.out.println("\n\t\t   Quick sort!");
        System.out.println(printArray(myarray));
        ss.quickSort(myarray);
        System.out.println(printArray(myarray));

        myarray = new int[]{43,23,12,5,9,90,4,1,0,6,43,91,45,65,12,34};
        System.out.println("\n\t\t   Bentley Quick sort!");
        System.out.println(printArray(myarray));
        ss.bentleyQuicksort(myarray);
        System.out.println(printArray(myarray));

        
    }

    private static String printArray(int[] myarray){
        String sum = "";
        for(int i=0;i<myarray.length;i++){
            sum+=myarray[i]+", ";
        }
        return sum;
    }
    



}