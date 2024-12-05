import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountCountries {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file/Colfuturo-Seleccionados.csv"));
        String pais;
        Map<String,Integer> paises=new HashMap<>();
        while ((pais = reader.readLine())!=null) {
            String [] dades=pais.split(",");
            Integer freq = paises.get(dades[6]);
            paises.merge(dades[6], 1, Integer::sum);
            paises.put(dades[6], freq==null ? 1: freq+1);
        }
        System.out.println(paises);
    }
}
