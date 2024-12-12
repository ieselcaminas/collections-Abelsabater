package Varios;

public class Mediana {
public static void main(String[] args) {
int[] num={1,2,6,17,18,22,35,46,109,143};
    System.out.println(mediana(num));
}
public static double mediana(int numeros[]){
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