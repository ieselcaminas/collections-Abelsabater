package Comparable;

public class Tesoros implements Comparable<Tesoros>{
private String nombre;
private int valor;

public Tesoros(String nombre, int valor) {
    this.nombre = nombre;
    this.valor = valor;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getValor() {
    return valor;
}

public void setValor(int valor) {
    this.valor = valor;
}
@Override
public String toString(){
    return this.nombre+" --> "+this.valor;
}
@Override
public int compareTo(Tesoros other){
    if(other.valor -this.valor==0){
        return this.nombre.compareTo(other.getNombre());
    }else {
        return other.valor -this.valor;
    }
}
}
