public class Stack<E>{
    private StackNode<E> top = null;
    private int size = 0;

    public void Stack(){
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (top == null);
    }
}
