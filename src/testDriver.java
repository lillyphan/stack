public class testDriver {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("true: " + stack.isEmpty());
        System.out.println("0: " + stack.size());

        for (int i = 0; i < 10; i++){
            stack.push(i);
            System.out.println(stack.size());
        }

        for (int i = 0; i < 10; i++){
            System.out.println(stack.pop());
        }

        System.out.println("null: " + stack.pop());
        System.out.println("0: " + stack.size());

        for (int i = 0; i < 5; i++){
            stack.push(i);
            System.out.println(stack.peek());
        }
    }
}
    