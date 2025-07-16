package br.com.poo.bancario;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private int numero;
    private int numeroAgenciasAbertas;
    private int numeroMaxAgencias;
    private static int numeroProximaAgencia = 1234;
    private List<Agencia> agencias = new ArrayList<>();

    public Banco(String nome, int numero, int numeroMaxAgencias){
        this.nome = nome;
        this.numero = numero;
        this.numeroMaxAgencias = numeroMaxAgencias;
    }
    public Agencia abrirAgencia(){
        Agencia agenciaCriada = new Agencia(String.valueOf(this.numeroProximaAgencia), this, 100);
        this.numeroProximaAgencia++;
        this.adicionaAgenciaLista(agenciaCriada);
        return agenciaCriada;
    }

    private void adicionaAgenciaLista(Agencia ag){
        this.agencias.add(ag);
    }

    public void imprimeAgencias(){
        for (Agencia agencia : this.agencias){
            System.out.println((agencia.toString()));
        }
    }
}
