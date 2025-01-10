package Arrays_Mapas_pilas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequencia {

    public static Map<String,Integer>frequencia(String lista){
        String [] list= lista.split(" ");
        Map<String,Integer>fre=new HashMap<>();
        Integer cont;
        for(String numers:list){
            cont= fre.get(numers);
            if(cont==null){
                fre.put(numers,1);
            }else{
                fre.put(numers,cont+1);
            }
        }
        return fre;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime els numeros");
        String lista= sc.nextLine();
        System.out.println(frequencia(lista));
    }

}
