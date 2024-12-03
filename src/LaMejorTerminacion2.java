import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LaMejorTerminacion2 {
    public static Map<Character,Integer> lamejorterminacion2(String[]boletos){
        Map<Character,Integer> terminacion=new HashMap<>();
        Integer cont;
        Character ultimo;
        for (String bol:boletos) {
            ultimo=bol.charAt(bol.length()-1);
            cont=terminacion.get(ultimo);
            if(cont == null){
                terminacion.put(ultimo,1);
            }else{
                terminacion.put(ultimo,cont+1);
            }
        }
        return terminacion;
    }

    public static void main(String[] args) {
        String [] boletos={"00004","03847","39804"};
        System.out.println(lamejorterminacion2(boletos));
    }

}
