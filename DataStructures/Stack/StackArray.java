package Stack;

import java.util.EmptyStackException;

public class StackArray<T> {
    private int DefaultSize=2;
    private T[] array;
    private int top;

    @SuppressWarnings("unchecked")
    public StackArray(){
        this.top=-1;
        this.array = (T[]) new Object[DefaultSize];
    }
    public void push(T e) {
        if(this.isFull()){
            Resize();
        }
        this.array[++this.top] = e;
    }

    public T pop(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        return element(this.top--);
    }

    public boolean isFull(){
        if(this.top+1==this.DefaultSize)
            return true;
        else
            return false;
    }
    public boolean isEmpty(){
        if(this.top==-1)
            return true;
        else
            return false;
        
    }

    public T top(){
        if(isEmpty())
            throw new EmptyStackException();
        return element(top);
    }

    public int size(){
        return this.top+1;
    }

    private T element(int index){
        T result = this.array[index];
        return result;
    }

    private void Resize(){
        @SuppressWarnings("unchecked")
        T[] new_array = (T[]) new Object[this.DefaultSize * 2];
        for(int i=0;i<this.DefaultSize;i++){
            new_array[i] = this.array[i];
        }
        this.DefaultSize*=2;
        this.array =  new_array;
    }

    public String toString(){
        String sum = "";
        for(int i=0;i<this.top+1;i++){
            sum+=this.array[i];
            sum+=", ";
        }
        return sum;
    }

}