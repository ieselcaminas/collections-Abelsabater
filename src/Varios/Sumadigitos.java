package Varios;

public class Sumadigitos {

public static int sumadigitos(String numero){
    int suma=0;
    for (int i = 0; i <numero.length() ; i++) {
        suma+=(numero.charAt(i)-'0');
    }
    return suma;
}

public static void main(String[] args) {
    System.out.println(sumadigitos("3343"));
}
}
