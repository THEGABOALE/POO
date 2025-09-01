package run;

public class Estudiante {
    String nombre;
    String matricula;
    double promedio;

    public Estudiante(String nombre, String matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public Boolean aprobado()
    {
        return promedio >= 70;
    }

    public String mostrarDatos()
    {
        return String.format("Nombre: %s, Matricula: %s, Promedio: %.2f", nombre, matricula, promedio);
    }
}
