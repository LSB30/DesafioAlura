package br.com.alura.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme("O Poderoso Lucas", 1910);
        primeiroFilme.avaliar(10);
        Filme filmeDoLucas = new Filme("THE GOAT LUCAS",2023);
        filmeDoLucas.avaliar(10);
        Serie lost = new Serie("lost",2020);
        lost.avaliar(5);
        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoLucas);
        lista.add(primeiroFilme);
        lista.add(lost);

       for(Titulo item: lista) {
           System.out.println(item.getNome());
           if(item instanceof Filme filme) {

               System.out.println("Classifiacao:"+ filme.getClassificacao());
           }
       }

        ArrayList<String> buscaArtista = new ArrayList<>();
        buscaArtista.add("Lucas");
        buscaArtista.add("Jasnas");
        buscaArtista.add("Curry");

        System.out.println(buscaArtista);
        Collections.sort(buscaArtista);
        System.out.println(buscaArtista);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
