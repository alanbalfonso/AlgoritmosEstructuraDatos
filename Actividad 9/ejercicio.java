/**
 * @author Alan Bauza Alfonso
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Clase Persona creada
class Persona {
    private String nombre;
    private int estatura, peso;

    // Constructor
    public Persona(String nombre, int estatura, int peso) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    // Método toString para convertir los datos en un string
    @Override
    public String toString() {
        return String.format("Nombre: %s, Estatura: %d, Peso: %d", nombre, estatura, peso);
    }
}

public class ejercicio {
    public static void main(String[] args) throws IOException {
        // Creación y llenado de lista de personas
        List<Persona> personas = new ArrayList<>();
        construirPersonas(personas);

        // Clonar la lista original
        List<Persona> personasClonadas = new ArrayList<>(personas);

        // Escoger criterio de ordenamiento
        String criterio = obtenerCriterioOrdenamiento();

        // Ordenar usando burbuja
        burbuja(personasClonadas, criterio);

        // Mostrar lista ordenada
        imprimirLista(personasClonadas);
    }

     // Construye 10 objetos y los agrega a la lista
    public static void construirPersonas(List<Persona> personas) {
        personas.add(new Persona("Daniela", 150, 54));
        personas.add(new Persona("Alan", 175, 80));
        personas.add(new Persona("Carlos", 168, 68));
        personas.add(new Persona("María", 160, 55));
        personas.add(new Persona("Juan", 180, 80));
        personas.add(new Persona("Sofía", 158, 52));
        personas.add(new Persona("Pedro", 172, 75));
        personas.add(new Persona("Laura", 170, 65));
        personas.add(new Persona("Andrés", 176, 70));
        personas.add(new Persona("Carmen", 163, 58));
    }

     // Método para obtener el criterio de ordenamiento desde el teclado
    public static String obtenerCriterioOrdenamiento() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el criterio de ordenamiento (nombre, estatura o peso): ");
        String criterio = reader.readLine().trim().toLowerCase();

         // Validar criterio
        while (!criterio.equals("nombre") && !criterio.equals("estatura") && !criterio.equals("peso")) {
            System.out.println("Criterio inválido. Intente de nuevo (nombre, estatura o peso): ");
            criterio = reader.readLine().trim().toLowerCase();
        }

        return criterio;
    }

     // Método de ordenamiento Burbuja
    public static void burbuja(List<Persona> personas, String criterio) {
        int n = personas.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                boolean cambio = false;
                switch (criterio) {
                    case "nombre":
                        if (personas.get(j).getNombre().compareTo(personas.get(j + 1).getNombre()) > 0) {
                            cambio = true;
                        }
                        break;
                    case "estatura":
                        if (personas.get(j).getEstatura() > personas.get(j + 1).getEstatura()) {
                            cambio = true;
                        }
                        break;
                    case "peso":
                        if (personas.get(j).getPeso() > personas.get(j + 1).getPeso()) {
                            cambio = true;
                        }
                        break;
                }
                if (cambio) {
                    Persona temp = personas.get(j);
                    personas.set(j, personas.get(j + 1));
                    personas.set(j + 1, temp);
                }
            }
        }
    }

     // Método para imprimir la lista en formato de tabla
    public static void imprimirLista(List<Persona> personas) {
        System.out.println("Nombre\tEstatura\tPeso");
        System.out.println("----------------------------");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + "\t" + persona.getEstatura() + "\t\t" + persona.getPeso());
        }
    }
} 