package Comparable;
import java.util.ArrayList;
import java.util.List;
public class OrdenarTesoros {
public static void main(String[] args) {
    List <Tesoros> tesorosList=new ArrayList<>();
    Tesoros tesoros=new Tesoros(10,2,"flecha");
    tesorosList.add(tesoros);
    tesoros=new Tesoros(2,3,"sarcofago");
    tesorosList.add(tesoros);
    tesoros=new Tesoros(10,8,"sandalia");
    tesorosList.add(tesoros);
    tesorosList.stream()
            .sorted()
            .forEach(System.out::println);
}
}
