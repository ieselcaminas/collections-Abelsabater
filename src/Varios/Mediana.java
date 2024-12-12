package Varios;
import java.util.Arrays;
public class Mediana {
public static void main(String[] args) {
int[] num={4,6,2,5,3,1,7};
    System.out.println(mediana(num));
}
public static double mediana(int numeros[]){
    Arrays.sort(numeros);
    int s1;
    int s2;
    double st;
    if(numeros.length%2!=0){
        st=numeros[numeros.length/2];
    }else{
        s1=numeros.length/2;
        s2=numeros.length/2 -1;
        st= (double) (numeros[s1] + numeros[s2]) /2;
    }
    return st;
}
}