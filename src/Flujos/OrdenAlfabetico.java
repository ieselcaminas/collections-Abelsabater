package Flujos;

import java.util.Arrays;
import java.util.List;

public class OrdenAlfabetico {

public static void main(String[] args) {
    List<Personas> personas= (List<Personas>) Arrays.asList(
            new Personas("Abel","Sabater",2006),
            new Personas("Ximo","Alcacer",1954),
            new Personas("Ana","Alvarez",2015)
            );
 personas.stream().
         map(Personas::getFirstName).
         distinct().
         sorted().
         forEach(System.out::println);
}
}
