package dataStructures.linkedLists;

public class Node<T> {
    protected Node<T> next;
    protected Node<T> prev;
    private T   data;

    public Node(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node(T data, Node<T> next, Node<T> prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

	public Node<T> getPrev() {
		return this.prev;
	}
	
	public void setPrev (Node<T> prev) {
		this.prev = prev;
	}
    
    public T getElement() {
		return this.data;
    }
	public void setElement (T data) {
		this.data = data;
    }
    
    public String toString() {
        return ""+this.data ;
    }






}