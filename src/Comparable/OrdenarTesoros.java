package Comparable;


import java.util.ArrayList;
import java.util.List;

public class OrdenarTesoros {
public static void main(String[] args) {
    List<Tesoros> tesorosList=new ArrayList<>();
    Tesoros tesoros=new Tesoros("flecha",50,5);
    tesorosList.add(tesoros);
    tesoros=new Tesoros("mascara",30,9);
    tesorosList.add(tesoros);
    tesoros=new Tesoros("mascara",30,12);
    tesorosList.add(tesoros);
    tesorosList.stream()
            .sorted()
            .forEach(System.out::println);
}
}
