import java.util.HashMap;
public class proyectoHash {
    public static void main(String[] args) {
        //Cada dato es de clave Integer y tipo String
        HashMap <Integer, String> hash = new HashMap<>();
        //inserta en la tabla clave de dato, dato
        hash.put(100,"RH");
        hash.put(200,"ventas");
        hash.put(300,"contabilidad");
        hash.put(400, "compras");
        
        System.out.println(hash);   //desordenada
        System.out.println();
        System.out.println(hash.get(200)); //Buscar e imprimir el valor de la clave

        if (hash.containsKey(300)){    //busqueda por key
            System.out.println("El dato del key 3000 es: ");
            System.out.println(hash.get(300));
        }

    }
}
