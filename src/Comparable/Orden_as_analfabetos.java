package Comparable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Orden_as_analfabetos {
public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader("file/illiterate.csv"));
    List<Pais> paisesList=new ArrayList<>();
    String pais;
    reader.readLine();
    while ((pais = reader.readLine())!=null) {
        String [] dades=pais.split(",");
        Pais paiss=new Pais(dades[5],Integer.parseInt(dades[8]));
        paisesList.add(paiss);
    }
    paisesList.stream().
    sorted().
    forEach(System.out::println);
}
}