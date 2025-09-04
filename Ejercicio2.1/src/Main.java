import run.ejercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        comprobacion c = new comprobacion();

        System.out.println("Digite un numero:");
        int numero = sc.nextInt();

        System.out.println("Resultado: %f", c.comprobacion(numero));
    }
}
