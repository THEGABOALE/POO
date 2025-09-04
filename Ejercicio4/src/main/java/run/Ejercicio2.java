package run;

public class Ejercicio2 {
    public static void main(String[] args)
    {
        Coche coche = new Coche();

        coche.marca = "Lamborghini";
        coche.modelo = "Urus";
        coche.año = 2018;

        System.out.println("Datos del coche: " + coche.mostrarDatos());
    }
}
