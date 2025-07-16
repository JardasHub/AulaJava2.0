package br.com.poo.aviao;

public class TesteVeiculos{
    public static void main(String[] args) {

        Pessoa gustavo = new Pessoa("Jardel");
        gustavo.setEndereco(new Endereco("Servidão do Senai", 235));

        Veiculo veiculo = new Aviao("Verde Limão", gustavo, 10);
    }
}
