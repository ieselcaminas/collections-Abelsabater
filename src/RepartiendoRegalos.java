import java.util.ArrayList;
import java.util.Scanner;

public class RepartiendoRegalos {

    public static String cerca(ArrayList<Integer>calles){
        int cont;
        int cerca=1000000000;
        int calless=calles.size();
        String orden="";
        int pos=0;
        int callact=calles.get(0);
        do{
            for (int i = 1; i < calless; i++) {
                cont=Math.abs(callact-calles.get(i));
                if(cont<=cerca){
                    cerca=cont;
                    pos=i;
                }
            }
            callact=calles.get(pos);
            orden+=" "+calles.get(pos);
            calless--;
            calles.remove(calles.get(pos));
        }while(calless>1);
        return orden;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> calles=new ArrayList<>();
        System.out.println("Quantas calles");
        int ncal= sc.nextInt();
        System.out.println("Posa el numero dels carrers");
        for (int i = 0; i < ncal; i++) {
            int cal= sc.nextInt();
            calles.add(cal);
        }
        System.out.println(cerca(calles));
    }
}
