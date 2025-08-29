package run;

import models.Student;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sesión 2, Miércoles, 27 de agosto");

        // Variables primitivas
        int numero = 0;
        int Numero = 1;
        int numer0 = 3;

        System.out.println(""+numero);
        System.out.println(""+Numero);
        System.out.println(""+numer0);

        float salario = 25000.00f; // Declarar f al final para inicializar el tipo de dato float
        System.out.println(""+salario);

        double promedio = salario*0.5;
        System.out.println(""+promedio); //Double es mas pesado que float por lo que ocupa más espacio

        String carrera = "Ingeniería en Sistemas de la Información";
        System.out.println(""+carrera);

        JOptionPane.showMessageDialog(null,carrera);

        Student student = new Student("José", "Durán", "Administración", 99);

        JOptionPane.showMessageDialog(null,student);
    }
}
