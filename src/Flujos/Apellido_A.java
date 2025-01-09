package Flujos;
import java.util.ArrayList;
public class Apellido_A {
public static void main(String[] args) {
    ArrayList<Personas> personas=new ArrayList<>();
    Personas p=new Personas("Abel","Sabater",2006);
    personas.add(p);
    p=new Personas("Ximo","Santos",1954);
    personas.add(p);
    p=new Personas("Ana","Alvarez",2015);
    personas.add(p);
   long num= personas.stream().
            filter(pers->pers.getLastName().charAt(0)=='A').
                     count();
    System.out.println(num);
}
}
