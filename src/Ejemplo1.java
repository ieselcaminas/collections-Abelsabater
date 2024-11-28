import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ejemplo1 {
    public static void main(String[] args) {
        ArrayList<Integer>numeros=new ArrayList<>();
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(3);
        numeros.add(5);
        double suma=0;
        for (int i = 0; i < numeros.size(); i++) {
            suma+=numeros.get(i);
        }
         Collections.sort(numeros);
        System.out.println(suma/(numeros.size()));
        System.out.println(numeros);
    }
}
