package com.mycompany.aula05;

public class Game {
  private String nome;
  private String desenvolvedora;
  private String categoria;
  private String descricao;
  private String requisitos;
  private double valor;
  private double tamanho;

  Game(){
    nome= " ";
    desenvolvedora= " ";
    categoria= " ";
    descricao= " ";
    requisitos= " ";
    valor= 0;
    tamanho = 0;
  }

  void setNome(String title) {
    nome= title;
  }

  String getNome() {
    return nome;
  }

  void setDesenvolvedora(String producer) {
    desenvolvedora= producer;
  }

  String getDesenvolvedora() {
    return desenvolvedora;
  }

  void setCategoria(String category) {
    categoria = category;
  }

  String getCategoria() {
    return categoria;
  }

  void setDescricao(String desc) {
    descricao = desc;
  }

  String getDescricao(){
    return descricao;
  }

  void setRequisitos(String reqs) {
    requisitos = reqs;
  }

  String getRequisitos(){
    return requisitos;
  }

  void setValor(double price) {
    valor = price;
  }

  double getValor(){
    return valor;
  }

  void setTamanho(double size) {
    tamanho = size;
  }

  double getTamanho(){
    return tamanho;
  }
}