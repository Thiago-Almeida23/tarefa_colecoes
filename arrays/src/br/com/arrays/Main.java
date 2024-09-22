package br.com.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListasComArrays listas = new ListasComArrays();

        System.out.println("Digite os nomes separados por vírgula: ");
        String nomes = scanner.nextLine();
        listas.ordenarNomes(nomes);

        System.out.println("\nDigite os nomes e gêneros (ex: João-M, Maria-F), separados por vírgula: ");
        String nomesComGenero = scanner.nextLine();
        listas.separarPorGenero(nomesComGenero);
    }
}

