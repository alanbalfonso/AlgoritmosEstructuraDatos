import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class evidencia {

    // Función main
    public static void main(String[] args) throws IOException{
    
    //declaracion de variables
    String nombre,comida; //nombre del alumno y comida a ordenar
    int numeroDeAlumnos = 10;
    
    //uso de la clase BufferedReader para entrada de datos
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Queue<orden> queue = new LinkedList<>();
    
    //Creacion de ordenes
    for (int i = 0;i < numeroDeAlumnos; i++){
        System.out.println("Orden numero " + (i + 1));
        System.out.println("Ingrese el nombre del Alumno: ");
        nombre = br.readLine();
        System.out.println("Ingrese la comida a ordenar: ");
        comida = br.readLine();
        
        orden Pedido = new orden(nombre,comida);    //atributos nombre y comida
        queue.add(Pedido);
    }
    for (int i = 0;i < numeroDeAlumnos; i++){
        orden e = queue.poll();
        //Escribir nombre de alumno y su orden
        System.out.println("\nOrden num: " + (i + 1));
            System.out.println("Alumno: " + e.getNombre());
            System.out.println("Orden: " + e.getComida());
    }
    }
    private static class orden{

        // Variables que contienen el nombre y la comida que ordenó el alumno.
        private String nombre, comida;

        //constructor
        public orden(String nombre, String comida){
            this.nombre = nombre;
            this.comida = comida;
        }

        //getter nombre de alumno
        public String getNombre(){
            return this.nombre;
        }
        
        //getter de la comida
        public String getComida(){
            return this.comida;
        }
        
    }
}