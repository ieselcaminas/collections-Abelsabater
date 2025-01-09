package Comparable;

import java.util.ArrayList;

public class Vehiculo {
public static void main(String[] args) {
    ArrayList<Classe> carglass= new ArrayList<>();
    Classe vehiculoo=new Classe("Seat","rojo");
    carglass.add(vehiculoo);
    vehiculoo=new Classe("Renault","amarillo");
    carglass.add(vehiculoo);
    carglass.stream().sorted().forEach(System.out::println);
}
}
