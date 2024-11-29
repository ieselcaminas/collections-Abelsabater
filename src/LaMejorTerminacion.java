import java.util.ArrayList;

public class LaMejorTerminacion {

    public static int lamejorterminacion(ArrayList<String> boletos, int num){
        int cont=0;
        char ultimo;
        for (String bol:boletos) {
            ultimo=bol.charAt(bol.length()-1);
            if(ultimo-'0'==num){
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        ArrayList<String> boletos=new ArrayList<>();
        boletos.add("00004");
        boletos.add("03847");
        boletos.add("39804");
        int num=4;
        System.out.println( num+"="+lamejorterminacion(boletos,num));
    }

}
