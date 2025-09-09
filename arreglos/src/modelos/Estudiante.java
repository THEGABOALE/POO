package modelos;

public class Estudiante {
    public String nombre;

    private int edad;

    public Estudiante() {}

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.edad + ", usted es " + (this.edad >= 18 ? "Mayor de edad": "Menor de edad");
    }
}
