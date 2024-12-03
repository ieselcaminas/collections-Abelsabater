import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagramas {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("spanish-dict"));
        String line;
        while ((line = reader.readLine()) != null) {
            //Trabajar con line
        }
        reader.close();
    }
    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}