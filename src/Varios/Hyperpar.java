package Varios;
public class Hyperpar {
public static void main(String[] args) {
    System.out.println(esHyperpar(2048));
    System.out.println(esHyperpar(4618));
}
public static boolean esHyperpar(int numeros){
    String num=Integer.toString(numeros);
    for (int i = 0; i <num.length(); i++) {
        if(num.charAt(i)%2!=0){
            return false;
        }
    }
    return true;
}
}