package run;

public class Ejercicio4 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Gabo", 500.00);

        //Mostrar estado de la cuenta (Titular + Saldo)
        System.out.println(cuenta.mostrarDatos());

        //Depositar
        cuenta.depositar(200);
        System.out.println("Despues de depositar: " + cuenta.mostrarDatos());

        //Retirar
        cuenta.retirar(350);
        System.out.println("Despues de retirar: " + cuenta.mostrarDatos());
    }
}
