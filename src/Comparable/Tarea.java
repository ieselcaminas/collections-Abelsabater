package Comparable;

public class Tarea implements Comparable<Tarea>{
private int tiempo;
private int prioridad;

public Tarea(int tiempo, int prioridad) {
    this.tiempo = tiempo;
    this.prioridad = prioridad;
}

public int getTiempo() {
    return tiempo;
}

public void setTiempo(int tiempo) {
    this.tiempo = tiempo;
}

public int getPrioridad() {
    return prioridad;
}

public void setPrioridad(int prioridad) {
    this.prioridad = prioridad;
}
@Override
 public String toString(){
    return this.prioridad+","+this.tiempo;
}
@Override
public int compareTo(Tarea other){
    if(other.prioridad -this.getPrioridad()==0){
        return this.tiempo - other.getTiempo();
    }else{
        return other.prioridad -this.getPrioridad();
    }
}
}
