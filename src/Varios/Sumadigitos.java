package Varios;
public class Sumadigitos {
public static String  sumadigitos(String numero){
    String num="";
    int suma=0;
    for (int i = 0; i <numero.length() ; i++) {
        if(i == 0){
            num+=numero.charAt(i);
        }else{
            num+="+"+numero.charAt(i);
        }
        suma+=(numero.charAt(i)-'0');
    }
    num+="="+suma;
    return num;
}
public static void main(String[] args) {
    System.out.println(sumadigitos("1212"));
}
}
