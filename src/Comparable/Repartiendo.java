package Comparable;
import java.util.ArrayList;
import java.util.List;
public class Repartiendo {
public static void main(String[] args) {
    List<Niños> niñosList=new ArrayList<>();
    Niños niños=new Niños(5,33);
    niñosList.add(niños);
    niños=new Niños(9,11);
    niñosList.add(niños);
    niños=new Niños(5,12);
    niñosList.add(niños);
    niñosList.stream().
            sorted().
            forEach(System.out::println);
}
}