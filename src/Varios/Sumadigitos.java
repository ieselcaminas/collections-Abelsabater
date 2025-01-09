package Varios;
public class Sumadigitos {
public static String sumadigitos(String numero){
    String sum="";
    int suma=0;
    for (int i = 0; i <numero.length() ; i++) {
        if(i == 0){
            sum+=numero.charAt(i);
        }else{
            sum+="+"+numero.charAt(i);
        }
        suma+=(numero.charAt(i)-'0');
    }
    sum+="="+suma;
    return sum;
}
public static void main(String[] args) {
    System.out.println(sumadigitos("7642"));
}
}
