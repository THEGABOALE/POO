package run;

public class ejercicio2 {

    //Leer un numero y decir si es multiplo de 4 y de 8

    public bolean comprobacion(double numero) {
        if (numero %4 == 0 && numero %8 == 0) {
            System.out.println("El número es multiplo de 4 y de 8.");
            return True;
        } else {
            System.out.println("El número no es multiplo de 4 y de 8.");
            return False;
        }

    }
}
