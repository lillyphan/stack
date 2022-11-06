public class Stack<E>{
    private StackNode<E> top = null;
    private int size = 0;

    public Stack(){}

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (top == null);
    }

    public void push (E element){
        top = new StackNode<E>(element, top);
        size++;
    }

    public E pop(){
        E topData = null;
        if (isEmpty()){
            return null;
        } else {
            topData = top.getData();
            StackNode<E> oldTop = top;
            top = oldTop.getChild();
            oldTop.setChild(null);
            size--;
        }
        return topData;
    }
}
