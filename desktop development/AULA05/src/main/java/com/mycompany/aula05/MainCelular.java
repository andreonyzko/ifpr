package com.mycompany.aula05;

import java.util.Scanner;

public class MainCelular {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    String marca, modelo, sistema_op;
    int memoria, bateria;
    double tela;
    System.out.print("=-=-=-=- CADASTRO CELULAR -=-=-=-=\nMarca: ");
    marca = read.nextLine();
    System.out.print("Modelo: ");
    modelo = read.nextLine();
    System.out.print("Sistema operacional: ");
    sistema_op = read.nextLine();
    System.out.print("Memoria (GB): ");
    memoria = read.nextInt();
    System.out.print("Bateria (mAh): ");
    bateria = read.nextInt();
    System.out.print("Tela (in): ");
    tela = read.nextDouble();
    Celular cell = new Celular(marca, modelo, sistema_op, memoria, bateria, tela);
    System.out.println("\n\n=-=-=-=- CELULAR CADASTRADO -=-=-=-=\nMarca: "+cell.getMarca()+"\nModelo: "+cell.getModelo()+"\nSistema Operacional: "+cell.getSistema()+"\nMemoria: "+cell.getMemoria()+"GB\nBateria: "+cell.getBateria()+"mAh\nTela: "+cell.getTela()+"in");
  }
}