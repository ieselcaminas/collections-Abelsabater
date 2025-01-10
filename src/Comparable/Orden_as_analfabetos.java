package Comparable;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Orden_as_analfabetos {
public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader("file/illiterate.csv"));
    List<Paises> paisesList=new ArrayList<>();
    String pais;
    while ((pais = reader.readLine())!=null) {
        String [] dades=pais.split(",");
        Paises paiss=new Paises(dades[4],Integer.parseInt(dades[7]));
        paisesList.add(paiss);
    }
    paisesList.stream().
    sorted().forEach(System.out::println);

}
}
