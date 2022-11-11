/**
 * testDriver
 * Author: Lilly Phan
 * Date: 11/05/2022
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: LP
 **/

//a driver that tests the functions of StackNode and Stack
public class testDriver {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //testing isEmpty() and size()
        System.out.println("true: " + stack.isEmpty());
        System.out.println("0: " + stack.size());

        //testing push()
        for (int i = 0; i < 10; i++){
            stack.push(i);
            System.out.println(stack.size());
        }

        //testing pop()
        for (int i = 0; i < 10; i++){
            System.out.println(stack.pop());
        }

        System.out.println("null: " + stack.pop());
        System.out.println("0: " + stack.size());

        //testing peek()
        for (int i = 0; i < 5; i++){
            stack.push(i);
            System.out.println(stack.peek());
        }
    }
}
    