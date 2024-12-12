import java.util.Stack;

public class ExpresionAritmetica {

public static boolean digito(String ex){
    return Character.isDigit(ex.charAt(0));
}
public static int expresionaritmetica(String hh){
    String [] ex=hh.split(" ");
    int n1=0;
    int n2=0;
    int resultat;
    Stack<Integer> pila= new Stack<>();
    for (int i = 0; i < ex.length; i++) {
       if(digito(ex[i])){
           pila.push(Integer.valueOf(ex[i]));
            n1=Integer.parseInt(ex[i]);
       }else{
           switch (ex[i]){
               case "+":
                    n1=Integer.parseInt(String.valueOf(pila.pop()));
                    n2=Integer.parseInt(String.valueOf(pila.pop()));
                    n1+=n2;
                    pila.push(n1);
                    break;
               case "-":
                   n1=Integer.parseInt(String.valueOf(pila.pop()));
                   n2=Integer.parseInt(String.valueOf(pila.pop()));
                   n1-=n2;
                   pila.push(n1);
                   break;
               case "*":
                   n1=Integer.parseInt(String.valueOf(pila.pop()));
                   n2=Integer.parseInt(String.valueOf(pila.pop()));
                   n1=n1*n2;
                   pila.push(n1);
                   break;
               case "/":
                   n1=Integer.parseInt(String.valueOf(pila.pop()));
                   n2=Integer.parseInt(String.valueOf(pila.pop()));
                   n1=n1/n2;
                   pila.push(n1);
                   break;
           }
       }
    }
    return n1;
}
public static void main(String[] args){
    String llista="2 4 5 3 / * +";
    System.out.println(expresionaritmetica(llista));
}
}