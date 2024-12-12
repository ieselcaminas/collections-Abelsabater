package Varios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Moda {
public static void main(String[] args) {
    int [] num={1,1,1,1,3,4,5,5,7,7,7,8,8};
    System.out.println(moda(num));
}
public static int moda(int[] numeros){
    Map<Integer,Integer> modaa=new HashMap<>();
    int m = 0;
    int max=Integer.MIN_VALUE;
    for (int i = 0; i < numeros.length; i++) {
        modaa.put(numeros[i],modaa.getOrDefault(numeros[0],0)+1);
    }
    for (Map.Entry<Integer, Integer> en: modaa.entrySet()) {
        if(en.getValue()>max){
            max=modaa.get(en.getValue());
            m= en.getKey();
        }
    }
    return m;
}
}