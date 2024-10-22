/**
 * @author Alan Bauza Alfonso
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.HashSet;

// Clase principal
public class tombola {
    //Tabla hash de premios de artículos
    private static HashMap<Integer, String> premiosArticulos = new HashMap<>();
    //Cola de prioridad
    private static PriorityQueue<Integer> colaGanadores = new PriorityQueue<>();
    private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        inicializarPremios();
        //Seccionado para evitar numeros repetidos
        HashSet<Integer> numerosGanadores = new HashSet<>();
        //Cantidad de numeros ganadores
        asignarNumeros(numerosGanadores, 30);
        //Añadir los números a la cola de prioridad
        colaGanadores.addAll(numerosGanadores); 
        System.out.println("¡Bienvenido a la tómbola! Presiona Enter para sacar un boleto.");
        entregarPremios();
    }

    /**
     * LLenado de la tabla Hash con los premios
     */
    private static void inicializarPremios() {
        premiosArticulos.put(7, "Television");
        premiosArticulos.put(12, "Coche");
        premiosArticulos.put(23, "Viaje de 2 noches");
        premiosArticulos.put(35, "iPad");
        premiosArticulos.put(40, "Laptop");
        premiosArticulos.put(42, "Bicicleta");
        premiosArticulos.put(44, "iPhone");
        premiosArticulos.put(45, "Tenis YEEZY");
        premiosArticulos.put(48, "Boletos para concierto");
        premiosArticulos.put(50, "Botella de vino");
    }

    /**
     * Asignación recursiva de números aleatorios, además de agregar a la lista si no está repetido
     * @param numeros
     * @param cantidad
     * @return numeros ganadores
     */
    private static void asignarNumeros(HashSet<Integer> numeros, int cantidad) {
        //!Evitar que se repita indefinidamente la funcion
        if (numeros.size() == cantidad) return;

        //Generacion de numeros aleatorios entre 1 al 50
        int numero = (int) (Math.random() * 50) + 1;
        
        //Si el HashSet no está lleno añadir un numero
        if (!numeros.contains(numero)) {
            numeros.add(numero);
        }
        asignarNumeros(numeros, cantidad);
    }

    /**
     * Interactividad con el usuario y entrega de ganadores
     * @throws IOException
     */
    private static void entregarPremios() throws IOException {
        //ColaGanadores debe estar lleno para empezar el programa
        while (!colaGanadores.isEmpty()) {
            System.out.print("Presiona Enter para sacar el siguiente boleto...\n");
            entrada.readLine();

            //Obtener el numero ganador
            int numero = colaGanadores.poll();
            if (premiosArticulos.containsKey(numero)) {
                System.out.println("Número ganador: " + numero + ", premio: " + premiosArticulos.get(numero));
            } else {
                System.out.println("Número ganador: " + numero + ", premio en efectivo.");
            }
        }
        System.out.println("¡Todos los premios han sido entregados! Gracias por participar.");
    }
}