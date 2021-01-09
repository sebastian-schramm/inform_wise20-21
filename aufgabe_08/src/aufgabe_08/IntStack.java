package aufgabe_08;

public class IntStack {
    private int[] stack;
    private int stackPos;
    private int stackSize;

    public IntStack(int size) {
        init(size);
        stackPos = 0;
        stackSize = size;
    }

    public void init(int size) {
        stack = new int[stackSize];
    }

    public boolean empty() {
        return (stackPos == 0);
    }

    public boolean full() {
        return (stackPos >= stackSize);
    }

    public void push(int number) {
        if (!full())
            stack[stackPos++] = number;
    }

    public void pop() {
        if (!empty())
            stack[--stackPos] = 0;
    }

    public int top() {
        return stack[stackPos];
    }

    public void print() {
        for (int tmp : stack)
            System.out.print(tmp + ", ");
        System.out.println();
    }
}
