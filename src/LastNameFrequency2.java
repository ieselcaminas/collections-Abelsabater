import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LastNameFrequency2 {

    public static Map<String,String>lastnamefrequency() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file/LastnameFrequencies.csv"));
        String apellido;
        Map<String,String> apellidos=new HashMap<>();
        while ((apellido = reader.readLine())!=null) {
            String [] ap= apellido.split(",");
            if (ap.length == 2) {
                apellidos.put(ap[0], ap[1]);
            }
        }
        return apellidos;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String apellido2;
        Map<String,String>apellidos=lastnamefrequency();
        System.out.println("Dime un apellido");
        apellido2= sc.nextLine().toUpperCase();
        System.out.println(apellidos.get(apellido2));
    }
}
