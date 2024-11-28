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
        Paises.put("España","Madrid");
        Paises.put("Italia","Roma");
        Paises.put("Francia","Paris");
        Paises.put("Argentina","Buenos aires");
        Paises.put("Alemania","Berlin");
        System.out.println("Dime un pais");
        String pais=sc.nextLine();
        System.out.println(paiscapital(Paises,pais));
    }
}
