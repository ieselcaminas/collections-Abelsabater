package Varios;
import java.util.HashMap;
import java.util.Map;
public class Moda {
public static void main(String[] args){
    int [] num={1,1,3,4,5,5,7,8,8,7,1,7,7};
    System.out.println(moda(num));
}
public static int moda(int[] numeros){
    Map<Integer,Integer> modaa=new HashMap<>();
    int m = 0;
    int max=Integer.MIN_VALUE;
    Integer veces;
    for (int i = 0; i < numeros.length; i++) {
        veces=modaa.get(numeros[i]);
        if(veces==null){
            modaa.put(numeros[i],1);
        }else{
            modaa.put(numeros[i],veces+1);
        }
    }
    for (Map.Entry<Integer, Integer> en: modaa.entrySet()){
        if(en.getValue()>max){
            max=en.getValue();
            m= en.getKey();
        }
    }
    return m;
}
}
