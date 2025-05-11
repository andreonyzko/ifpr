package com.mycompany.aula04;

public class Copo {
  int capacidadeMaxima, capacidadeAtual;
  String cor, material;


  Copo(){
    capacidadeMaxima = 100;
    capacidadeAtual = 0;
    cor = "transparente";
    material = "plastico";
  }
  
  void encher(){
    capacidadeAtual = capacidadeAtual + 50;
    if(capacidadeAtual > capacidadeMaxima){
      System.out.println("transbordou!");
    }
  }

  void esvaziar(){
    capacidadeAtual = capacidadeAtual - 50;
    if(capacidadeAtual < 0){
      capacidadeAtual = 0;
      System.out.println("seco!");
    }
  }
  
  int getCapacidadeAtual(){
      return capacidadeAtual;
  }

  void setCor(String c){
    cor = c;
  }

  void setMaterial(String m){
    material = m;
  }

  void setCapacidadeMaxima(int cap){
    capacidadeMaxima = cap;
  }

  void exibirInformacoes(){
    System.out.println("O copo "+cor+" de "+material+" armazena até "+capacidadeMaxima+"ml e atualmente contém "+capacidadeAtual+"ml de líquido");
  }
}