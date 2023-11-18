import java.util.LinkedList;

public class IntegerQueue {
    private LinkedList<Integer> queue;

    public IntegerQueue() {
        queue = new LinkedList<>();
    }

    public void insert(Integer i) {
        queue.addLast(i);
    }

    public Integer remove() {
        return queue.isEmpty() ? null : queue.removeFirst();
    }

    public Integer seek() {
        return queue.isEmpty() ? null : queue.getFirst();
    }

    public int size() {
        return queue.size();
    }

    public boolean search(Integer i) {
        return queue.contains(i);
    }

    public String toString() {
        return queue.isEmpty() ? "Empty queue" : queue.toString();
    }
}
