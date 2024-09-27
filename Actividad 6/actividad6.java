/*
 * Realizar un programa en Java, que calcule la probabilidad de que al lanzar una moneda quede de una cara o de otra. El programa
 * debe solicitar el numero de veces que será lanzada la moneda y la probabilidad de que caiga de un lado u otro de la moneda. En el
 * contexto de las monedas mexicanas es el aguila o la cara.
 * 
 * @author: Alan Bauza Alfonso
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

public class actividad6 {
    public static void main(String[] args) throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        Random tirada = new Random();

        System.out.println("Escribe el número de veces que será lanzada la moneda: ");
        int lanzamientos = Integer.parseInt(entrada.readLine());

        //Contadores de veces que cae cara o sol
        int contadorAguila = 0;
        int contadorSol = 0;

        //Ciclo para lanzar la moneda las veces necesarias
        for(int i = 0; i < lanzamientos; i++){
            //Resultados de los lanzamientos (si cae aguila o sol, aguila = 0 y sol = 1)
            int resultadoLanzamientos = tirada.nextInt(2);

            //Aumentar el numero de aguila o sol
            if(resultadoLanzamientos == 0){
                contadorAguila++;
            }
            else{
                contadorSol++;
            }
        }

        //Impresion de resultados
        System.out.println("Resultados:");
        System.out.println("Aguila: " + contadorAguila);
        System.out.println("Sol: " + contadorSol);

        //Resultado en double
        double probAguila = (double) contadorAguila / lanzamientos;
        double probSol = (double) contadorSol / lanzamientos;

        System.out.println("Probabilidad de que cayera aguila: " + probAguila);
        System.out.println("Probabilidad de que cayera sol: " + probSol);
    }
}
