package run;

public class CuentaBancaria {
    String titular;
    double saldo;

    //Constructor
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //Métodos
    public void depositar(double cantidad)
    {
        if (cantidad>=0)
        {
            System.out.println("Se depositaron $" + cantidad + " correctamente.");
            saldo+=cantidad;
        }
        else
        {
            System.out.println("La cantidad a depositar debe de ser positiva.");
        }
    }

    public void retirar(double cantidad)
    {
        if (cantidad>=0)
        {
            System.out.println("Se retiraron $" + cantidad + " correctamente.");
            saldo-=cantidad;
        }
        else
        {
            System.out.println("La cantidad a retirar debe de ser positiva.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String mostrarDatos()
    {
        return String.format("Titular: %s, Saldo: %f.", titular, saldo);
    }
}
