package Comparable;
import java.util.ArrayList;
import java.util.List;
public class OrdenarTesoros {
public static void main(String[] args) {
    List <Tesoros> tesorosList=new ArrayList<>();
    Tesoros tesoros=new Tesoros(5,1,"flecha",1);
    tesorosList.add(tesoros);
    tesoros=new Tesoros(1000,1000,"sarcofago",2);
    tesorosList.add(tesoros);
    tesoros=new Tesoros(10,2,"sandalia",2);
    tesorosList.add(tesoros);
    tesoros=new Tesoros(1000,10,"mascara",3);
    tesorosList.add(tesoros);
    tesoros=new Tesoros(10,2,"arco",3);
    tesorosList.add(tesoros);
    tesorosList.stream()
            .sorted()
            .forEach(System.out::println);
}
}