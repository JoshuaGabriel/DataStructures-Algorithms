package dataStructures.linkedLists;
public class LinkedList<T> {
    
    private int size;
    private Node<T> tail;
    private Node<T> head;

    public LinkedList(){ // This linked list uses concept of sentinel nodes
        this.head =  null;
        this.tail = null;
        this.size = 0;
    }

    // public void insertBefore(Node<T> p, T data){
    //     Node<T> np = new Node<T>(data);
    //     np.next = p;
	// 	np.prev = p.prev;
	// 	p.prev.next = np;
    //     p.prev = np;
    //     this.size--;
    // }
    
    // adds at the end of linked list
    public void insertBack(T data){
        Node<T> np = new Node<T>(data);
        if(size==0){
            this.head = np;
            this.tail = np;
        }else{
            Node<T> temp = this.tail;
            temp.next = np;
            np.prev = temp;
            this.tail = np;
        }
        this.size++;
    }

	public void remove(Node<T> p) {
		p.prev.next = p.next;
		p.next.prev = p.prev;
	}

    public Node<T> getHead(){
        return this.head;
    }
    public Node<T> getTail(){
        return this.tail;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        if(this.size==0)
            return true;
        return false;
    }

    public String toString(){
        if(size==0){
            return "Linked List is empty";
        }
        
        Node<T> cur = this.head;
        String sum = "";
        
        for(int i=0;i<size;i++){
            sum+=cur.toString()+", ";
            cur = cur.next;
        }
        return sum;

    }











}