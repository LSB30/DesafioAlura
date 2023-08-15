package br.com.alura.screematch.calculo;

public class Recomendado {


    public void Filtra(Classificavel classificavel) {
        if(classificavel.getClassificacao() >= 4) {
            System.out.println("está entre os preferidos no momentos");
        } else if(classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Adicione na sua lista para ver mais tarde");
        }
    }
}
