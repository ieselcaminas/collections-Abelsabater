package Comparable;

public class Tesoros implements Comparable<Tesoros>{
private String nombre;
private int valor;
private int cantidad;

public Tesoros(String nombre, int valor, int cantidad) {
    this.nombre = nombre;
    this.valor = valor;
    this.cantidad=cantidad;
}

public int getCantidad() {
    return cantidad;
}

public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
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
    return this.nombre+" --> "+this.valor+" --> "+this.cantidad;
}
@Override
public int compareTo(Tesoros other){
    if(other.valor -this.valor==0){
        return this.nombre.compareTo(other.getNombre());
    }else if (this.nombre.compareTo(other.getNombre())==0) {
        return other.cantidad-this.cantidad;
    }else {
        return other.valor -this.valor;
    }
}
}
