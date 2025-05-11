package com.mycompany.aula03;

import java.util.Scanner;

public class ex003 {
    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n1, n2;
        System.out.print("Digite um valor: ");
        n1 = read.nextInt();
        System.out.print("Digite outro valor: ");
        n2 = read.nextInt();
        verifica_maior(n1,n2);
    }
    
    static void verifica_maior(int n1, int n2) {
        int maior;
        if(n1 <= n2) maior = n2;
        else maior = n1;
        exibir_maior_valor(maior);
    }
    
    static void exibir_maior_valor(int maior){
      System.out.println("Valor maior: "+maior);
    }
}
