import java.util.LinkedList;

public class IntegerStack {
    // Utiliza una LinkedList para almacenar los elementos de la pila.
    private LinkedList<Integer> stack;

    // Constructor: inicializa la LinkedList.
    public IntegerStack() {
        stack = new LinkedList<>();
    }

    // Método push: añade un elemento al comienzo de la lista (cima de la pila).
    public void push(Integer i) {
        stack.addFirst(i);
    }

    // Método pop: elimina y devuelve el elemento en la cima de la pila.
    // Retorna null si la pila está vacía.
    public Integer pop() {
        return stack.isEmpty() ? null : stack.removeFirst();
    }

    // Método top: devuelve el elemento en la cima de la pila sin eliminarlo.
    // Retorna null si la pila está vacía.
    public Integer top() {
        return stack.isEmpty() ? null : stack.getFirst();
    }

    // Método size: devuelve el número de elementos en la pila.
    public int size() {
        return stack.size();
    }

    // Método search: busca un elemento en la pila y devuelve true si está presente.
    public boolean search(Integer i) {
        return stack.contains(i);
    }

    // Método toString: proporciona una representación en cadena de la pila.
    // Muestra "Empty stack" si la pila está vacía.
    public String toString() {
        return stack.isEmpty() ? "Empty stack" : stack.toString();
    }
}
