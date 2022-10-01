package poo;

import java.io.Serializable;
import java.time.*;
import java.util.ArrayList;

public class Espetaculo implements Serializable {

    private LocalTime horaInicio, horaFim;
    private String local, tipo;
    private LocalDate data;
    private int id;
    private int tamanho;
    private ArrayList<Bilhete> bilhetes = new ArrayList<Bilhete>(tamanho);
    private int total;

    public Espetaculo() {

        data = LocalDate.of(1, 1, 1);
        local = "Não definido!";
        horaInicio = LocalTime.of(0, 0);
        horaFim = LocalTime.of(0, 0);
        tamanho = 100;
        double nu = (Math.random()*1000);
        id = (int)nu%1000;

    }

    public Espetaculo(String tipo, String local, LocalDate data, LocalTime horaInicio, LocalTime horaFim, int tamanho) {

        this.tamanho = tamanho;
        this.local = local;
        this.data = data;
        this.tipo = tipo;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        double nu = (Math.random()*1000);
        id = (int)nu%1000;
        total = tamanho - bilhetes.size();

    }

    public void adicionarBiblete(Bilhete bilhete) {

        bilhetes.add(bilhete);
        total = total - 1;

    }

    public Bilhete procurarBilhete(Pessoa pessoa) {

        for (Bilhete i : bilhetes) {

            if (pessoa.equals(i.getPessoa())) {

                return i;

            }

        }
        System.out.println("Não encontrado o bilhete comprado!\n");
        return null;

    }

    public void removerBilhete(Pessoa pessoa) {

        for (Bilhete i : bilhetes) {

            if (pessoa.equals(i.getPessoa())) {

                bilhetes.remove(i);

                System.out.println("Removido com sucesso!\n");
                return;

            }

        }

        System.out.println("Não foi possivel remover,pois não exite este bilhete!\n");

    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public ArrayList<Bilhete> getBilhetes() {
        return bilhetes;
    }

    public void setBilhetes(ArrayList<Bilhete> bilhetes) {
        this.bilhetes = bilhetes;
    }

    public String bilhetesDisponiveis() {
        return "Tem " + total + " bilhetes disponiveis!\n";
    }
    @Override
    public String toString() {

        String aux = "| Total de Bilhetes: " + total + " | ID:  " + id + " | Nome: " + tipo  + " | Local: " + local + " | Data: " + data
                + " | Hora de Início: " + horaInicio + " | Hora do Fim: " + horaFim + " |\n\n";

        for(Bilhete i : bilhetes) {

            aux = aux + "----- Bilhete -----\n\n" + i;
        }
        return aux;

    }
    public String consultar() {


        return "| Total de Bilhetes: " + total + " | ID:  " + id + " | Nome: " + tipo  + " | Local: " + local + " | Data: " + data
                + " | Hora de Início: " + horaInicio + " | Hora do Fim: " + horaFim + " |\n\n";

    }
    @Override
    public Object clone() {

        Espetaculo aux = new Espetaculo(tipo, local, data, horaInicio, horaFim, tamanho);
        double nu = (Math.random()*1000);
        aux.setId((int)nu%1000);
        return aux;

    }
    @Override
    public boolean equals(Object espetaculo) {
        if (espetaculo != null && this.getClass() == espetaculo.getClass()) {

            Espetaculo aux = (Espetaculo) espetaculo;

            return this.id == aux.id && this.local == aux.local && this.data == aux.data && this.horaFim == aux.horaFim
                    && this.horaInicio == aux.horaInicio && this.tipo == aux.tipo && this.tamanho == aux.tamanho;

        }

        return false;

    }

}
