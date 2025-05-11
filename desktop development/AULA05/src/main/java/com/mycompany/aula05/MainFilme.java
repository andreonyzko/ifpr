package com.mycompany.aula05;

import java.util.Scanner;

public class MainFilme {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    Filme movie = new Filme();
    String nome, produtora, genero, duracao, sinopse;
    double valor;
    
    System.out.print("=-=-=-=- CADASTRO DE FILME -=-=-=-=\nTítulo: ");
    nome = read.nextLine();
    movie.setNome(nome);

    System.out.print("Produtora: ");
    produtora = read.nextLine();
    movie.setProdutora(produtora);

    System.out.print("Gênero: ");
    genero = read.nextLine();
    movie.setGenero(genero);

    System.out.print("Duração: ");
    duracao = read.nextLine();
    movie.setDuracao(duracao);

    System.out.print("Valor: R$");
    valor = read.nextDouble();
    movie.setValor(valor);

    System.out.print("Sinopse: ");
    sinopse = read.nextLine();
    movie.setSinopse(sinopse);

    System.out.println("\n\n=-=-=-= FILME CADASTRADO =-=-=-=\nTítulo: "+movie.getNome()+"\nProdutora: "+movie.getProdutora()+"\nGênero: "+movie.getGenero()+"\nDuração: "+movie.getDuracao()+"\nValor: R$"+movie.getValor()+"\nSinopse: "+movie.getSinopse());
  }
}