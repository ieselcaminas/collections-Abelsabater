package Varios;

import java.util.Arrays;

public class CualFalta {

public static int cualfalta(int [] numeros){
    Arrays.sort(numeros);
    int falte=Integer.MIN_VALUE;
    for (int i = 0; i < numeros.length-1; i++) {
        if(numeros[i+1]-numeros[i]>1){
            falte=numeros[i]+1;
        }
    }
    return falte;
}

public static void main(String[] args) {
    int [] numeros={3,2,5,4,1,7};
    int [] num2={3,2,5,4,1,6};
    if(cualfalta(num2)>Integer.MIN_VALUE){
        System.out.println("Falte el numero "+cualfalta(numeros));
    }else{
        System.out.println("No falte ningun");
    }
}
}
