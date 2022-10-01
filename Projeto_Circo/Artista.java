package poo;

import java.io.Serializable;

public class Artista extends Pessoa implements Serializable {

    private String tipo;
    private double salario;


    // Construtores
    public Artista(Pessoa p, String tipo, double salario){
        super(p.getId(), p.getPrimeiroNome(), p.getSegundoNome(), p.getSexo(), p.getPaisDeOrigem(), p.getDataNascimento());
        this.tipo = tipo;
        this.salario = salario;
    }


    // Outros Metodos
    public double aumentarSalario(double percentagem) {
        if (percentagem > 0){
            return salario = salario + ((percentagem/100) * salario);
        } else {
            return 0;
        }
    }

    public double diminuirSalario(double percentagem) {
        if (percentagem > 0) {
            return salario = salario * (percentagem/100);
        } else {
            return 0;
        }
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Artista obj = (Artista) o;
            return (super.equals(obj) && tipo == obj.tipo && salario == obj.salario);
        }
        return false;
    }

    @Override
    public Object clone() {
        Pessoa p = (Pessoa) super.clone();
        Artista novoArtista = new Artista(p, tipo, salario);
        return novoArtista;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspecialidade: " + tipo + "\nSalario: " + salario;
    }
}
