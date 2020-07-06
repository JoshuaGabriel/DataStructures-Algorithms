package datastructures.queue;

import datastructures.linkedlists.*;


public class QueueLinked<T> { 
    LinkedList<T> ll;

    public QueueLinked(){
        ll = new LinkedList<T>();
    }

    // Adds value at position at tail
    public void enqueue(T data){
        ll.insertBack(data);
    }
    //  returns value and removes least recently added element (front)
    public Node<T> dequeue(){
        return ll.popFront();
    }

    public boolean empty(){
        if(ll.size()==0){
            return true;
        }
        return false;
    }
    public String toString(){
        return ll.toString();
    }
}