package Flujos;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ImprimirNumeros {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();
    int num = 1;
    while(num>=0){
        System.out.println("Dime un numero");
        num= sc.nextInt();
        numeros.add(num);
    }
    ArrayList <Integer> lista= (ArrayList<Integer>) numeros.stream().
    filter(n->n>=1 && n<=5).
    collect(Collectors.toList());
    System.out.println(lista);
}
}
