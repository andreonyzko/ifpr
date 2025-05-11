package com.mycompany.aula05;

public class Filme {
  private String nome;
  private String produtora;
  private String genero;
  private String duracao;
  private double valor;
  private String sinopse;

  Filme(){
    nome= " ";
    produtora= " ";
    genero= " ";
    duracao= " ";
    valor= 0;
    sinopse= " ";
  }

  void setNome(String title) {
    nome= title;
  }

  String getNome() {
    return nome;
  }

  void setProdutora(String producer) {
    produtora= producer;
  }

  String getProdutora() {
    return produtora;
  }

  void setGenero(String genre) {
    genero = genre;
  }

  String getGenero() {
    return genero;
  }

  void setDuracao(String duration) {
    duracao = duration;
  }

  String getDuracao(){
    return duracao;
  }

  void setValor(double price) {
    valor = price;
  }

  double getValor(){
    return valor;
  }

  void setSinopse(String resume) {
    sinopse = resume;
  }

  String getSinopse(){
    return sinopse;
  }
}