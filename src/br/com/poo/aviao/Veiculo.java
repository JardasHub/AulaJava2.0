package br.com.poo.aviao;

public abstract class Veiculo {
    private String cor;
    private int qtdLugares;
    private Pessoa pessoa;

    public abstract void ligar();
    public abstract void desligar();
    public abstract void locomover();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdLugares() {
        return qtdLugares;
    }

    public void setQtdLugares(int qtdLugares) {
        this.qtdLugares = qtdLugares;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
