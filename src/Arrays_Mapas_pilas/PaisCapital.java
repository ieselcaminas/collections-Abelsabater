package Arrays_Mapas_pilas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {

    public static String paiscapital(Map<String, String>Paises, String pais){
        return Paises.getOrDefault(pais,"No sabem la capital del pais o no existeix");
    }
    public static void main(String[] args) {
        Map<String,String>Paises=new HashMap<String,String>();
        Scanner sc=new Scanner(System.in);
        Paises.put("ESPAÑA","Madrid");
        Paises.put("ITALIA","Roma");
        Paises.put("FRANCIA","Paris");
        Paises.put("ARGENTINA","Buenos aires");
        Paises.put("ALEMANIA","Berlin");
        System.out.println("Dime un pais");
        String pais=sc.nextLine().toUpperCase();
        System.out.println("La capital de eixe pais es: ");
        System.out.println(paiscapital(Paises,pais));
    }
}
