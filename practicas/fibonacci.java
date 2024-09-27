import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int fibo = 0, b = 1, c, n;
        //Llenado de datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de la serie: ");
        n = teclado.nextInt();

        //Ciclo hasta llegar al numero ingresado
        for(int i = 0; i < n; i++){
            System.out.print(fibo);
            //Primer bucle: c = 0 + 1
            c = fibo + b;
            //fibo cambia de 0 a 1
            fibo = b;
            //C cambia de 0 a 1
            b = c;

            if(n > (i + 1)){
                System.out.print(",");
            }
        }
        teclado.close();
    }
}
