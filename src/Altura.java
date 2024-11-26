import java.util.ArrayList;
import java.util.Scanner;

public class Altura {


    public static int numeroalumnos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuantos alumnos hay?");
        return sc.nextInt();
    }
    public static double leerAlturas(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime la altura");
        return sc.nextDouble();
    }
    public static double Media(ArrayList<Double>Altura, int div){
        double suma=0;
        for (Double alt : Altura) {
            suma += alt;
        }
        return suma/div;
    }
    public static int AlturaSuperior(ArrayList<Double>altura, double media){
        int altsu=0;
        for (Double alt : altura) {
            if (alt > media) {
                altsu++;
            }
        }
        return altsu;
    }
    public static int AlturaInferior(ArrayList<Double>altura, double media){
        int inferior=0;
        for (Double aDouble : altura) {
            if (aDouble < media) {
                inferior++;
            }
        }
        return inferior;
    }

    public static void mostrarresultados(ArrayList<Double>Altura, double media){
        System.out.println(AlturaSuperior(Altura,media));
        System.out.println(AlturaInferior(Altura,media));
    }

    public static void main(String[] args) {
        int alm=numeroalumnos();
        ArrayList<Double> Altura=new ArrayList<>();
        for (int i = 0; i < alm; i++) {
            Altura.add(leerAlturas());
        }
        double media=Media(Altura,alm);
        System.out.println(media);
        mostrarresultados(Altura,media);

    }
}
