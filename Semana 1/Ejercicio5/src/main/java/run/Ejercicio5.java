package run;

public class Ejercicio5 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Johaneris", "25YC2", 98.65);
        Estudiante estudiante1 = new Estudiante("Ricardo", "25YC1", 57.89);

        Estudiante[] estudiantes = {estudiante, estudiante1};

        for (Estudiante est: estudiantes)
        {
            System.out.println("Datos del estudiante: " + est.mostrarDatos());
            System.out.println(est.aprobado()? "Está aprobado" : "Está reprobado");
        }
    }
}
