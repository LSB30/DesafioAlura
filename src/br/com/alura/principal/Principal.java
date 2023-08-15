package br.com.alura.principal;

import br.com.alura.screematch.calculo.CalculadoraDeTempo;
import br.com.alura.screematch.calculo.Recomendado;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme("O Poderoso Lucas", 1910);
        primeiroFilme.setDuracaoEmMinutos(300);
        primeiroFilme.exibeFichaTecnica();
        primeiroFilme.avaliar(8);
        primeiroFilme.avaliar(4);
        System.out.println("Total de Avaliações: " + primeiroFilme.getTotalDeAvaliacao());
        System.out.println(primeiroFilme.pegaMedia());

        Serie lost = new Serie("Lost",2020);
        lost.setTemporadas(10);
        lost.setEpPorTemporadas(20);
        lost.setMinutosPorEp(50);
        lost.exibeFichaTecnica();
        System.out.println("Tempo para marotonar lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(primeiroFilme);
        System.out.println(calculadora.getTempoTotal());

        Recomendado filtro = new Recomendado();
        filtro.Filtra(primeiroFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalDeView(300);

        filtro.Filtra(episodio);

        Filme filmeDoLucas = new Filme("THE GOAT LUCAS",2023);
        filmeDoLucas.setDuracaoEmMinutos(777);
        filmeDoLucas.avaliar(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoLucas);
        listaDeFilmes.add(primeiroFilme);
        System.out.println("Tamnho da lista de filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);






    }
}
