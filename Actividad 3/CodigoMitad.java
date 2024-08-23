/*
 * Si el valor de mitad es 1, se genera una pila con los elementos desde abajo hasta la mitad.
 * Si vale 2, se genera una pila con los elementos desde la mitad, hasta el que está en la cima.	
 */

import java.util.Stack;
public class CodigoMitad {
    
    // Función para separar la pila según el valor de mitad
    public static Stack<Integer> separarPila(Stack<Integer> pila, int mitad) {
        // Si la pila está vacía, retorna una pila vacía
        if (pila.isEmpty()) {
            return new Stack<>();
        }

        // Tamaño total de la pila
        int tamano = pila.size();
        // Punto de mitad (si es impar, ajustamos a la mitad inferior)
        int puntoMitad = tamano / 2;
        
        Stack<Integer> pilaResultado = new Stack<>();
        Stack<Integer> pilaAuxiliar = new Stack<>();
        
        // Si mitad es 1, tomamos los elementos desde el fondo hasta la mitad
        if (mitad == 1) {
            for (int i = 0; i < puntoMitad; i++) {
                pilaAuxiliar.push(pila.get(i));
            }
            
            while (!pilaAuxiliar.isEmpty()) {
                pilaResultado.push(pilaAuxiliar.pop());
            }
        } 
        // Si mitad es 2, tomamos los elementos desde la mitad hasta la cima
        else if (mitad == 2) {
            for (int i = puntoMitad; i < tamano; i++) {
                pilaAuxiliar.push(pila.get(i));
            }
            
            while (!pilaAuxiliar.isEmpty()) {
                pilaResultado.push(pilaAuxiliar.pop());
            }
        }

        return pilaResultado;
    }
    
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(15);
        pila.push(10);
        pila.push(3);
        pila.push(7);
        pila.push(12);

        // Llamada con mitad = 1
        Stack<Integer> pilaMitad1 = separarPila(pila, 1);
        System.out.println("Pila desde abajo hasta la mitad: " + pilaMitad1);

        // Llamada con mitad = 2
        Stack<Integer> pilaMitad2 = separarPila(pila, 2);
        System.out.println("Pila desde la mitad hasta la cima: " + pilaMitad2);
    }
}
