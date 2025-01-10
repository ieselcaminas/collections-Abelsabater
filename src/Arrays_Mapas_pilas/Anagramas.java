package Arrays_Mapas_pilas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Anagramas {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file/spanish-dict (1).txt"));
        String palabra;
        String ordenada;
        Map<String,ArrayList<String>>palabrass=new HashMap<>();
        ArrayList<String>palas=new ArrayList<>();
        while ((palabra = reader.readLine())!=null) {
            ordenada=alphabetize(palabra);
            palas=palabrass.get(ordenada);
            if(palas==null){
                palas=new ArrayList<>();
                palas.add(palabra);
                palabrass.put(ordenada,palas);
            }else{
                palas.add(palabra);
                palabrass.put(ordenada,palas);
            }
        }
        reader.close();
        System.out.println(palabrass);
    }



    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}