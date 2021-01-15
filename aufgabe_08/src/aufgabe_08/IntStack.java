package aufgabe_08;

public class IntStack {
    private int[] stack;
    private int stackPos;

    public IntStack(int size) {
        init(size);
        stackPos = -1;
    }

    /**
     * Legt ein neues stack array mit der größe size an
     * @param size
     */
    private void init(int size) {
        this.stack = new int[size];
    }

    /**
     * Prüft ob die stackPos gleich -1 ist und gibt true zurück,
     * andernfalls false
     * @return
     */
    public boolean empty() {
        return (stackPos == -1);
    }

    /**
     * Prüft ob die stackPos größer gleich stack.length ist und
     * gibt true zurück, andernfalls false
     * @return
     */
    public boolean full() {
        return (stackPos >= stack.length-1);
    }

    /**
     * Fügt eine Zahl zum stack hinzu
     * @param number
     */
    public void push(int number) {
        //Prüft ob der stack voll ist
        if (!full())
            stack[++stackPos] = number;
    }

    /**
     * Entfernt eine Zahl vom stack
     */
    public void pop() {
        //Prüft ob der stack leer ist
        if (!empty())
            stack[stackPos--] = 0;
    }

    /**
     * Gibt die letzte Zahl aus dem stack zurück
     * @return
     */
    public int top() {
        return stack[stackPos];
    }

    /**
     * Gibt alle Zahlen die sich im stack befinden aus
     */
    public void print() {
        for (int tmp : stack)
            System.out.print(tmp + ", ");
        System.out.println();
    }
}
