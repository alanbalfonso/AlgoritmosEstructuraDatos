import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class factorial {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("Inserte un numero para obtener su factorial" );
        int numero = Integer.parseInt(br.readLine());
        int factorial = 1;
    
        while(numero != 0){
        factorial= numero;
        numero--;
        }
        System.out.println("El factorial es: " + factorial);
        }
}
