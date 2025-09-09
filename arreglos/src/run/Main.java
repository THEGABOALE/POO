package run;

import dao.EstidianteDAO;
import modelos.Estudiante;

public class Main {
    public static void main(String[] args) {
        /*int[] edades = new int [3];
        edades[0] = 18;
        edades[1] = 19;
        edades[2] = 15;

        for (int edad : edades) {
            String msn = edad + ", " + (edad >= 18 ? "Mayor de edad": "Menor de edad"); //Operador Ternario
            System.out.println(msn);
        }

        Estudiante[] listado = new Estudiante[3];

        listado[0] = new Estudiante("Steven", 18);
        listado[1] = new Estudiante("Sofia", 15);
        listado[2] = new Estudiante("Juan", 19);

        for (Estudiante est: listado) {
            System.out.println(est);
        }*/

        EstidianteDAO dao = new EstidianteDAO();

        dao.agregarEstudiante(new Estudiante("Daya", 18));

        for (Estudiante est: dao.mostrar()) {
            System.out.println(est);
        }
    }
}
