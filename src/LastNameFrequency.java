import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LastNameFrequency {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader("file/LastnameFrequencies.csv"));
        String apellido;
        Map<String,String> apellidos=new HashMap<>();
        while ((apellido = reader.readLine())!=null) {
            String [] ap= apellido.split(",");
            apellidos.put(ap[0],ap[1]);
        }
        System.out.println("Dime un apellido");
        apellido= sc.nextLine().toUpperCase();
        System.out.println(apellidos.get(apellido));
    }
}