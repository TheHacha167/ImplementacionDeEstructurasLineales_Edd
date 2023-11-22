import java.util.LinkedList;

public class IntegerQueue {
    // Utiliza una LinkedList para almacenar los elementos de la cola.
    private LinkedList<Integer> queue;

    // Constructor: inicializa la LinkedList.
    public IntegerQueue() {
        queue = new LinkedList<>();
    }

    // Método insert: añade un elemento al final de la lista (final de la cola).
    public void insert(Integer i) {
        queue.addLast(i);
    }

    // Método remove: elimina y devuelve el elemento en el frente de la cola.
    // Retorna null si la cola está vacía.
    public Integer remove() {
        return queue.isEmpty() ? null : queue.removeFirst();
    }

    // Método seek: devuelve el elemento en el frente de la cola sin eliminarlo.
    // Retorna null si la cola está vacía.
    public Integer seek() {
        return queue.isEmpty() ? null : queue.getFirst();
    }

    // Método size: devuelve el número de elementos en la cola.
    public int size() {
        return queue.size();
    }

    // Método search: busca un elemento en la cola y devuelve true si está presente.
    public boolean search(Integer i) {
        return queue.contains(i);
    }

    // Método toString: proporciona una representación en cadena de la cola.
    // Muestra "Empty queue" si la cola está vacía.
    public String toString() {
        return queue.isEmpty() ? "Empty queue" : queue.toString();
    }
}
