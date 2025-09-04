package run;

public class ejercicio1 {
    // Calcular el cubo de un numero impar multiplo de 3

    public int numero;

    public void mostrar(){
        System.out.println("Digite um numero: ");
        if numero != impar() {
            System.out.println("El número no es impar múltiplo de 3.");
        } else {
            cubo_numero(numero);
        }
    }

    public boolean impar(int numero) {
        if (numero % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int cubo_numero(int numero) {
        return numero * numero * numero;
    }

}
