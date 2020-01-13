public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.Push('a');
        stack.Push('b');
        stack.Push('c');
        stack.Push('d');
        stack.Push('e');
        stack.Push('f');

        System.out.println(stack.Pop());
        System.out.println(stack.Top());
        System.out.println(stack.Pop());
    }
}
