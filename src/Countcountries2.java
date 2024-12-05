import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Countcountries2 {

    public static Map<String,Integer>countcountries() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file/Colfuturo-Seleccionados.csv"));
        String pais;
        reader.readLine();
        Map<String,Integer> paises=new HashMap<>();
        while ((pais = reader.readLine())!=null) {
            String [] dades=pais.split(",");
            Integer freq = paises.get(dades[6]);
            if (freq==null)
                paises.put(dades[6], 1);
            else
                paises.put(dades[6], freq+1);
        }
        return paises;
    }

    public static void main(String[] args) throws IOException {
       Map<String,Integer>paises=countcountries();
        System.out.println(paises);
    }
}
