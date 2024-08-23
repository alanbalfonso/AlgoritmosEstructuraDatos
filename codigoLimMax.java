/*
 * Se tiene que retornar una pila donde se incluyan solo los nodos que tengan un valor menor o igual a limiteMax.
 */
import java.util.Stack;

public class CodigoLimMax {
    
    // Función que filtra la pila según el límite máximo
    public static Stack<Integer> filtrarPila(Stack<Integer> pila, int limiteMax) {
        // Crear una nueva pila para almacenar los elementos filtrados
        Stack<Integer> pilaFiltrada = new Stack<>();

        // Si la pila está vacía, retorna una pila vacía
        if (pila.isEmpty()) {
            return pilaFiltrada;
        }

        // Recorrer la pila original
        for (Integer elemento : pila) {
            // Solo agregar a la nueva pila si el valor es menor o igual al límite máximo
            if (elemento <= limiteMax) {
                pilaFiltrada.push(elemento);
            }
        }

        return pilaFiltrada;
    }
    
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(15);
        pila.push(10);
        pila.push(3);

        int limiteMax = 10;
        Stack<Integer> pilaFiltrada = filtrarPila(pila, limiteMax);

        System.out.println("Pila original: " + pila);
        System.out.println("Pila filtrada (<= " + limiteMax + "): " + pilaFiltrada);
    }
}
