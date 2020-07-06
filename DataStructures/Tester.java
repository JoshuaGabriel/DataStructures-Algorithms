package datastructures;
import datastructures.stack.*;
import datastructures.linkedlists.*;

public class Tester {
    public static void main(String[] args) {
        StackArray<Integer> sk = new StackArray<Integer>();
        sk.push(5);
        System.out.println(sk.toString());

        LinkedList<Integer> ll = new LinkedList<Integer>();
        
        ll.insertBack(5);
        ll.insertBack(20);
        ll.insertBack(-24);
        ll.insertFront(3);
        System.out.println(ll.toString());


    }



}