package Comparable;
public class Niños implements Comparable<Niños>{
private int puntuacion;
private int pesoregalos;
public Niños(int puntuacion, int pesoregalos) {
    this.puntuacion = puntuacion;
    this.pesoregalos = pesoregalos;
}
public int getPuntuacion() {
    return puntuacion;
}
public void setPuntuacion(int puntuacion) {
    this.puntuacion = puntuacion;
}
public int getPesoregalos() {
    return pesoregalos;
}
public void setPesoregalos(int pesoregalos) {
    this.pesoregalos = pesoregalos;
}
@Override
public String toString(){
    return this.puntuacion+" - "+this.pesoregalos;
}
@Override
public int compareTo(Niños other){
    if(other.puntuacion -this.puntuacion ==0){
        return this.pesoregalos -other.getPesoregalos();
    }else {
        return other.puntuacion -this.puntuacion;
    }
}
}
