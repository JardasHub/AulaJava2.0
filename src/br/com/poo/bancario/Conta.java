package br.com.poo.bancario;

public class Conta {
    private double saldo;
    private String numero;
    private Cliente titular;

    public Conta(double saldo, Cliente titular, String numero) {
        this.saldo = saldo;
        this.titular = titular;
        this.numero = numero;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
