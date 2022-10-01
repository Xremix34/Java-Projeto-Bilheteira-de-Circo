package poo;

import java.io.Serializable;

public class Bilhete implements Serializable {

    private int id;
    private double preco = 15;
    private Pessoa pessoa;
    private String nomeEspetaculo;

    public Bilhete(int id, String primeiroNome, String segundoNome,String nome) {

        pessoa = new Pessoa(id, primeiroNome, segundoNome);
        this.id = id;
        this.descontoDoBilhete();
        nomeEspetaculo = nome;

    }

    public Bilhete(int id, String primeiroNome, String segundoNome, int anoNascimento,
                   int mesNascimento, int diaNascimento,String nome) {

        pessoa = new Pessoa(id, primeiroNome, segundoNome, anoNascimento, mesNascimento,diaNascimento);
        this.id = id;
        nomeEspetaculo = nome;
        this.descontoDoBilhete();


    }

    public void descontoDoBilhete() {

        int idade = pessoa.calcularIdade();
        boolean verificador = (idade != 0);

        if (verificador) {
            if (idade <= 9) {
                preco = 8;
            } else if (idade > 9 && idade <= 18) {
                preco = 12;
            } else {
                preco = 15;
            }
        }

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String toString() {
        return "Nome do Espetaculo: " + nomeEspetaculo + ", ID: "+ id + ", Preço: " + preco + "\n" + pessoa + " \n\n";
    }

    public boolean equals(Object bilhete) {
        if (bilhete != null && this.getClass() == bilhete.getClass()) {

            Bilhete aux = (Bilhete) bilhete;

            return this.id == aux.id && this.preco == aux.preco && this.pessoa.equals(aux.getPessoa());

        }

        return false;

    }

}
