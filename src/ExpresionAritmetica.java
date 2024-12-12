import java.util.Stack;

public class ExpresionAritmetica {

public static boolean digito(char ex){
    return Character.isDigit(ex);
}

public static int expresionaritmetica(String hh){
    char ex;
    Stack<Character> pila= new Stack<>();
    for (int i = 0; i < hh.length(); i++) {
        ex=hh.charAt(i);
       if(digito(ex)){
           pila.push(ex);
       }else{

       }
    }
}

public static void main(String[] args) {

}
}
