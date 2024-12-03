import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffered {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file/spainish.dict"));
        String line;
        while ((line = reader.readLine())!=null) {
            //Trabajar con line
        }
        reader.close();
    }
}
