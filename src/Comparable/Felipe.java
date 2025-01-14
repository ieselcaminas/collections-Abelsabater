package Comparable;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Felipe {
public static void main(String[] args) {
    int ntarea;
    int prio;
    int tiempo;
    List<Tarea> tareaList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    System.out.println("Cuantas tareas tiene Felipe?");
    ntarea= sc.nextInt();
    for (int i = 0; i < ntarea; i++) {
        System.out.println("Prioridad de esta tarea");
        prio= sc.nextInt();
        System.out.println("Tiempo que se tarda en hacer");
        tiempo= sc.nextInt();
        Tarea tarea=new Tarea(tiempo,prio);
        tareaList.add(tarea);
    }
    tareaList.stream().
            sorted().forEach(System.out::println);
    System.out.println(0);
}
}