package com.mycompany.aula05;

import java.util.Scanner;

public class MainGame {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    Game game = new Game();
    String nome, desenvolvedora, categoria, descricao, requisitos;
    double valor, tamanho;
    
    System.out.print("=-=-=-=- CADASTRO DE JOGO -=-=-=-=\nNome: ");
    nome = read.nextLine();
    game.setNome(nome);

    System.out.print("Desenvolvedora: ");
    desenvolvedora = read.nextLine();
    game.setDesenvolvedora(desenvolvedora);

    System.out.print("Categoria: ");
    categoria = read.nextLine();
    game.setCategoria(categoria);

    System.out.print("Descricao: ");
    descricao = read.nextLine();
    game.setDescricao(descricao);

    System.out.print("Requisitos: ");
    requisitos = read.nextLine();
    game.setRequisitos(requisitos);

    System.out.print("Valor: R$");
    valor = read.nextDouble();
    game.setValor(valor);

    System.out.print("Tamanho: ");
    tamanho = read.nextDouble();
    game.setTamanho(tamanho);
    
    System.out.println("\n\n=-=-=-= JOGO CADASTRADO =-=-=-=\nNome: "+game.getNome()+"\nDesenvolvedora: "+game.getDesenvolvedora()+"\nCategoria: "+game.getCategoria()+"\nDescrição: "+game.getDescricao()+"\nRequisitos: "+game.getRequisitos()+"\nValor: R$"+game.getValor()+"\nTamanho: "+game.getTamanho()+"GB");
  }
}