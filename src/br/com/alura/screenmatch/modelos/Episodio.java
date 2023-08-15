package br.com.alura.screenmatch.modelos;

import br.com.alura.screematch.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeView;

    public int getTotalDeView() {
        return totalDeView;
    }

    public void setTotalDeView(int totalDeView) {
        this.totalDeView = totalDeView;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        return totalDeView > 100 ? 4 : 2;
    }
}
