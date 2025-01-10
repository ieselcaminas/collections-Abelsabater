package Comparable;
public class Pais  implements Comparable<Pais>{
private String nombre;
private int n_analfabetos;
public Pais(String nombre, int n_analfabetos) {
    this.nombre = nombre;
    this.n_analfabetos = n_analfabetos;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public int getN_analfabetos() {
    return n_analfabetos;
}
public void setN_analfabetos(int n_analfabetos) {
    this.n_analfabetos = n_analfabetos;
}
@Override
public String toString(){
    return this.nombre+", "+this.n_analfabetos;
}
@Override
public int compareTo(Pais other){
    return this.n_analfabetos-other.getN_analfabetos();
}
}