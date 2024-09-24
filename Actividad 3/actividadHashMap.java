/*
 * Realizar un programa  donde debe de utilizar la clase Map Y HashMap de Java, para implementar la siguiente salida del programa.
 * primero=Estudiante [id = 1, apellido = Perez, edad= 25, fechaIngreso Sun Sep 22 23:25:00 CST 2024]
 * segundo=Estudiante [id = 2, apellido = Lopes, edad= 28, fechaIngreso Sun Sep 22 23:25:00 CST 2024]
 * tercero=Estudiante [id = 3, apellido = Cuevas, edad= 26, fechaIngreso Sun Sep 22 23:25:00 CST 2024]
 */
import java.util.Date;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class actividadHashMap {
    public static void main(String[] args) {
        //Creacion de estudiantes
        //!Modificacion de fechas debido a diferentes zonas horarias
        Estudiante primero = new Estudiante(1, "Perez", 25, Date.from(Instant.parse("2024-09-23T05:25:00.00Z")));
        Estudiante segundo = new Estudiante(2, "Lopez", 28, Date.from(Instant.parse("2024-09-23T05:25:00.00Z")));
        Estudiante tercero = new Estudiante(3, "Cuevas", 26, Date.from(Instant.parse("2024-09-23T05:25:00.00Z")));

        /*System.out.println(primero);
        System.out.println(segundo);
        System.out.println(tercero);*/

        //LLenado de HashMap 
        HashMap<String, Estudiante> hash = new HashMap<>();
        hash.put("primero", primero);
        hash.put("segundo", segundo);
        hash.put("tercero", tercero);

        //Mapeo de elementos y ordenado para el output
        for (Map.Entry<String, Estudiante> salida : hash.entrySet()) {
            //Impresion de cada elemento dentro de hashMap
            System.out.println(salida);
        }
    }
}

