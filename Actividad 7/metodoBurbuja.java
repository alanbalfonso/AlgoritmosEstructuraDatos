import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class metodoBurbuja{
public static void main(String[] args) throws IOException {
//Uso de la libreria BufferedReader e InputStreamReader para la lectura de datos    
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
int auxiliar = 0;

//Definir tamaño del array
System.out.println("Ingrese la cantidad de numeros a ordenar:");
int tamano = Integer.parseInt(entrada.readLine());
int lista[] = new int[tamano];

//Registro de datos en el arreglo
for (int i = 0; i < lista.length; i++) {
            System.out.print("introduce el valor de la posicion " + (i+1) + ": ");
            lista[i] = Integer.parseInt(entrada.readLine());
        }

//! MENOR A MAYOR
//Acomodar datos con metodo de la burbuja de menor a mayor
for (int i = 0; i < lista.length - 1; i++) {    
            for (int j = i; j < lista.length; j++) {
                //recorre todo el array todas las veces iguales a la cantidad de datos en el
                if (lista[i] > lista[j]) {
                    auxiliar = lista[i];
                    lista[i] = lista[j];
                    lista[j] = auxiliar;
                }
            }
        }

//Mostrar los datos ordenados
    System.out.println("Lista ordenada de menor a mayor: ");
    for (int i = 0; i < lista.length; i++) {
        System.out.print(lista[i] + " ");
    }

//! MAYOR A MENOR
    //Acomodar datos con metodo de la burbuja de mayor a menor
for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i; j < lista.length; j++) {
                //mismo funcionamiento del anterior metodo pero al revés
                if (lista[i] < lista[j]) {
                    auxiliar = lista[i];
                    lista[i] = lista[j];
                    lista[j] = auxiliar;
                }
            }
        }

//Mostrar los datos ordenados
    System.out.println("\nLista ordenada de mayor a menor: ");
    for (int i = 0; i < lista.length; i++) {
        System.out.print(lista[i] + " ");
    }

}
}