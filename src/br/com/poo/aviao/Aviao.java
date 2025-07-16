package br.com.poo.aviao;

public class Aviao extends Veiculo {

    public Aviao(String cor, Pessoa pessoa, int qtdLugares) {
        super.setCor(cor);
        super.setPessoa(pessoa);
        super.setQtdLugares(qtdLugares);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o Avião");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o Avião");
    }

    @Override
    public void locomover() {
        System.out.println("Avião em locomoção");
    }
}
