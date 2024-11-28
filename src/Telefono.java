import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefono {

    public static void telefono(Map<String,Integer>Guiatelefono,String pers){
        int telefono=0;
        if(Guiatelefono.containsKey(pers)){
            System.out.println(Guiatelefono.get(pers));
        }else{
            System.out.println("No tenim a eixa persona guardada");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map <String,Integer> Guiatelefonos=new HashMap<>();
        Guiatelefonos.put("ABEL",711460219);
        Guiatelefonos.put("PAU",665426637);
        Guiatelefonos.put("MANEL",725639857);
        System.out.println("Dime una persona");
        String pers= sc.nextLine().toUpperCase();
        telefono(Guiatelefonos,pers);

    }
}
