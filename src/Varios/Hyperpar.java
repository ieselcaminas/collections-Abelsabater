package Varios;
public class Hyperpar {
public static void main(String[] args) {
    System.out.println(esHyperpar(2048));
    System.out.println(esHyperpar(4618));
}
public static boolean esHyperpar(int numeros){
    while(numeros>0){
        int digito=numeros%10;
        if(digito%2!=0){
            return false;
        }
        numeros/=10;
    }
    return true;
}
}