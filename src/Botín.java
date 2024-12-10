import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Botín {
public static Map<Integer,String> reparto(int num,String [] billetes){
    Map<Integer,String> reparto=new HashMap<>();
    int letocaA;
    String botin;
    for (int i = 0; i < billetes.length; i++) {
        letocaA=i%num;
        botin= reparto.get(letocaA);
        if(botin==null){
            reparto.put(letocaA,billetes[i]);
        }else{
            reparto.put(letocaA,botin+"/ "+billetes[i]);
        }
    }
    return reparto;
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Quants lladres hi han");
    int num= sc.nextInt();
    String [] billetes={"10","20","50","200","100","500","20"};
    System.out.println(reparto(num,billetes).toString());
    }
}
