package br.com.arrays;

import java.util.Arrays;

public class ListasComArrays {

    // Método para ordenar os nomes
    public void ordenarNomes(String input) {
        String[] nomes = input.split(",");

        // Remover espaços em branco
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        // Ordenar os nomes
        Arrays.sort(nomes);

        // Imprimindo os nomes em ordem alfabética
        System.out.println("Nomes em ordem alfabética: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    // Método para separar e ordenar nomes por gênero
    public void separarPorGenero(String input) {
        String[] listaDeNomes = input.split(",");
        String[] masculinos = Arrays.stream(listaDeNomes)
                .filter(nomeGenero -> nomeGenero.contains("-M") || nomeGenero.contains("-m"))
                .map(nomeGenero -> nomeGenero.split("-")[0].trim())
                .toArray(String[]::new);
        String[] femininos = Arrays.stream(listaDeNomes)
                .filter(nomeGenero -> nomeGenero.contains("-F") || nomeGenero.contains("-f"))
                .map(nomeGenero -> nomeGenero.split("-")[0].trim())
                .toArray(String[]::new);

        // Ordenar os arrays de nomes
        Arrays.sort(masculinos);
        Arrays.sort(femininos);

        // Imprimir os nomes por gênero
        System.out.println("\nNomes masculinos: ");
        for (String nome : masculinos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes femininos: ");
        for (String nome : femininos) {
            System.out.println(nome);
        }
    }
}

