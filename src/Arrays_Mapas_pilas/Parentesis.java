package Arrays_Mapas_pilas;

import java.util.Stack;

public class Parentesis {

public static boolean parentesis(String frase) {
    Stack<Character> pila = new Stack<>();
    char h;
    char ult;
    for (int i = 0; i < frase.length(); i++) {
        h = frase.charAt(i);
        if (h == '[' || h == '(' || h == '{') {
            pila.push(h);
        }else if (h == ')') {
            if(pila.isEmpty()){
                return false;
            }
            if (pila.pop() != '(') {
                return false;
            }
        }else if (h == ']') {
            if(pila.isEmpty()){
                return false;
            }
            if (pila.pop() != '[') {
                return false;
            }
        }else if (h == '}') {
            if(pila.isEmpty()){
                return false;
            }
            if (pila.pop() != '{') {
                return false;
            }
        }
    }
    return pila.isEmpty();
}
public static void main(String[] args) {
    String frase= "(){}";
    System.out.println(parentesis(frase));
    }
}
