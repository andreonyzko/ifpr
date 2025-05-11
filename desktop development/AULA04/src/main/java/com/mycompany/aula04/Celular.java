package com.mycompany.aula04;

public class Celular {
  String marca, modelo, sistema_op;
  int memoria, bateria;
  double tela;

  Celular(String brand, String model, String system, int memory, int batery, double screen){
    marca = brand;
    modelo = model;
    sistema_op = system;
    memoria = memory;
    bateria = batery;
    tela = screen;
  }

  String getMarca(){
    return marca;
  }

  String getModelo(){
    return modelo;
  }

  String getSistema(){
    return sistema_op;
  }

  int getMemoria(){
    return memoria;
  }

  int getBateria(){
    return bateria;
  }

  double getTela(){
    return tela;
  }
}