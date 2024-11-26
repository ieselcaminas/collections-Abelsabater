import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Coche {
    public static void main(String[] args) {
        ArrayList<String> Coche=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String marca;
        do{
            System.out.println("Dime una marca");
            marca= sc.nextLine();
            if(!marca.isEmpty()){
                Coche.add(marca);
            }
        }while(!marca.isEmpty());
        Collections.sort(Coche);
        for (int i = 0; i < Coche.size(); i++) {
            System.out.println(Coche.get(i));
        }
    }
}
