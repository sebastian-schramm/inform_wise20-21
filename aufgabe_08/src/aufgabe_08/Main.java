package aufgabe_08;

public class Main {

    public static void main(String[] args) {
        IntStack stack = new IntStack(32);
        stack.print();
        System.out.println(stack.empty());
        stack.push(12);
        stack.push(2);
        for (int i = 0; i < 12; ++i)
            stack.push((int) (Math.random()*100));
        stack.print();
        System.out.println(stack.empty());
        System.out.println(stack.full());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print();
        for (int i = 0; i < 12; ++i)
            stack.push((int) (Math.random()*100));
        System.out.println(stack.empty());
        System.out.println(stack.full());
        stack.print();
        for (int i = 0; i < 12; ++i)
            stack.push((int) (Math.random()*100));
        System.out.println(stack.empty());
        System.out.println(stack.full());
        stack.print();

        for (int i = 0; i < 40; ++i)
            stack.pop();

        stack.push(3);
        stack.print();
    }
}
