public class Stack<E>{
    StackNode<E> top = null;
    int size = 0;

    public void Stack(){
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (top == null);
    }
}
