import java.util.LinkedList;

public class IntegerStack {
    private LinkedList<Integer> stack;

    public IntegerStack() {
        stack = new LinkedList<>();
    }

    public void push(Integer i) {
        stack.addFirst(i);
    }

    public Integer pop() {
        return stack.isEmpty() ? null : stack.removeFirst();
    }

    public Integer top() {
        return stack.isEmpty() ? null : stack.getFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean search(Integer i) {
        return stack.contains(i);
    }

    public String toString() {
        return stack.isEmpty() ? "Empty stack" : stack.toString();
    }
}
