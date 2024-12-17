package Varios;

import java.util.Arrays;

public class CualFalta {

public static int cualfalta(int [] numeros){
    Arrays.sort(numeros);
    int falte=Integer.MIN_VALUE;
    for (int i = 0; i < numeros.length-1; i++) {
        int resta=numeros[i+1]-numeros[i];
        if(resta>1){
            return numeros[i]+1;

        }
    }
    return -1;
}

public static void main(String[] args) {
    System.out.println(cualfalta(new int[]{3,2,1,5,6}));
    System.out.println(cualfalta(new int[]{3,2,1,5,4}));
    }
}
