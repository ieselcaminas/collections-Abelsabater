package Comparable;

public class Tesoros implements Comparable<Tesoros> {
private int valor;
private int peso;
private String nombre;

public Tesoros(int valor, int peso, String nombre) {
    this.valor = valor;
    this.peso = peso;
    this.nombre = nombre;
}

public String getNombre() {
    return nombre;
}

public int getValor() {
    return valor;
}

public void setValor(int valor) {
    this.valor = valor;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}
public int getPeso() {
    return peso;
}
public void setPeso(int peso) {
    this.peso = peso;
}
@Override
public String toString() {
    return this.nombre+" valor "+this.valor+ " peso "+this.peso;
}
@Override
public int compareTo(Tesoros other){
if(other.getValor()-this.valor==0){
    return this.peso-other.getPeso();
}else{
   return other.getValor()-this.valor;
}
}
}