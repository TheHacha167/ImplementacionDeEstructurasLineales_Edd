public class Principal {
    public static void main(String[] args) {
        // Demostración de IntegerStack
        System.out.println("Demostración de IntegerStack:");
        IntegerStack stack = new IntegerStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Contenido de la pila: " + stack);
        System.out.println("Elemento superior (pop): " + stack.pop());
        System.out.println("Contenido de la pila después de pop: " + stack);
        System.out.println("Elemento superior (top): " + stack.top());
        System.out.println("Tamaño de la pila: " + stack.size());
        System.out.println("¿Está el número 2 en la pila? " + stack.search(2));
        System.out.println("¿Está el número 3 en la pila? " + stack.search(3));

        // Línea separadora
        System.out.println("\n----------------------------------------\n");

        // Demostración de IntegerQueue
        System.out.println("Demostración de IntegerQueue:");
        IntegerQueue queue = new IntegerQueue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        System.out.println("Contenido de la cola: " + queue);
        System.out.println("Elemento frente de la cola (remove): " + queue.remove());
        System.out.println("Contenido de la cola después de remove: " + queue);
        System.out.println("Elemento frente de la cola (seek): " + queue.seek());
        System.out.println("Tamaño de la cola: " + queue.size());
        System.out.println("¿Está el número 2 en la cola? " + queue.search(2));
        System.out.println("¿Está el número 3 en la cola? " + queue.search(3));
    }
}