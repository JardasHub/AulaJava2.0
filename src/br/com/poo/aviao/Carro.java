package br.com.poo.aviao;

public class Carro extends Veiculo{
    public Carro(String cor, Pessoa pessoa, int qtdLugares) {
        super.setCor(cor);
        super.setPessoa(pessoa);
        super.setQtdLugares(qtdLugares);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o Carro");

    }

    @Override
    public void desligar() {
        System.out.println("Desligando o Carro");
    }

    @Override
    public void locomover() {
        System.out.println("Carro em locomoção");
    }
}
