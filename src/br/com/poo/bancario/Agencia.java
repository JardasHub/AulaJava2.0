package br.com.poo.bancario;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String numero;
    private Banco banco;

    private int numeroContasAbertas;
    private int numeroMaxContas;
    private static int numeroProximaConta = 1455;

    private List<Conta> contas = new ArrayList<>();

    public Agencia(String num, Banco bc, int numeroMaxContas){
        this.numeroMaxContas = numeroMaxContas;
        this.numero = num;
        this.banco = bc;
    }

    public Conta abrirConta(double saldo, Cliente cliente){
        Conta contaAberta = new Conta(saldo, String.valueOf(numeroProximaConta), cliente);
        this.adicionarContaLista(contaAberta);
        return contaAberta;
    }

    private void adicionarContaLista(Conta conta){
        this.contas.add(conta);
        this.numeroProximaConta++;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
