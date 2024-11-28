import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TelefonoII {
    public static void telefono(HashMap<String, ArrayList<Integer>> Guiatelefono, String pers){
        int telefono=0;
        if(Guiatelefono.containsKey(pers)){
            System.out.println(Guiatelefono.get(pers));
        }else{
            System.out.println("No tenim a eixa persona guardada");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String, ArrayList<Integer>> Guiatelefonos=new HashMap<>();
        ArrayList<Integer>telefonos=new ArrayList<>();
        telefonos.add(711460219);
        telefonos.add(629350754);
        telefonos.add(624918634);

        Guiatelefonos.put("ABEL",telefonos);
        Guiatelefonos.put("PAU",telefonos);
        Guiatelefonos.put("MANEL",telefonos);
        System.out.println("Dime una persona");
        String pers= sc.nextLine().toUpperCase();
        telefono(Guiatelefonos,pers);

    }
}
