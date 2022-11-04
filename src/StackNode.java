public class StackNode<E> {
    private StackNode<E> child;
    private E data;

    public StackNode(){
        //empty constructor
    }

    public StackNode(E data){
        //constructor with one data parameter
        this.data = data;
    }

    public StackNode(E data, StackNode<E> child){
        //constructor with two parameters for data and child Node
        this.data = data;
        this.child = child;
    }

    //accessors
    public E getData() {
        //returns data
        return data;
    }

    public StackNode<E> getChild() {
        //returns child Node
        return child;
    }

    //mutators
    public void setChild(StackNode<E> child) {
        //changes instance Node child to specified Node
        this.child = child;
    }

    public void setData(E data) {
        this.data = data;
    }

    //other

    @Override
    public String toString() {
        //overrides Objects' toString and returns a string specifying data of the Node
        return "Node: " + data;
    }

    public boolean equals(StackNode<E> node) {
        //overrides Objects' equals and returns a string specifying whether the data of each Node is equal using .equals
        return data.equals(node.data);
    }

}