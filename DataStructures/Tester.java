package datastructures;
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
        int[] myarray = {43,23,12,5,9,90,4,1,0,6,43,91,45,65,12,34};
        myarray = ss.selectionSort(myarray);
        String sum = "";
        for(int i=0;i<myarray.length-1;i++){
            sum+=myarray[i]+", ";
        }
        System.out.println(sum);
    }



}