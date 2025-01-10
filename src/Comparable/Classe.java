package Comparable;

public class Classe implements Comparable<Classe>{
private String coche;
private String color;

public Classe(String coche, String color) {
    this.coche = coche;
    this.color = color;
}
public String getCoche() {
    return this.coche;
}
public String getColor() {
    return this.color;
}
@Override
public String toString() {
    return this.getCoche() + " de color " + this.getColor();
}
@Override
public int compareTo(Classe vehiculo) {
    if (this.coche.equals(vehiculo.getCoche())) {
        return 0;
    } else if (this.coche.compareTo(vehiculo.getCoche())>1) {
        return 1;
    } else {
        return -1;
    }
}
}