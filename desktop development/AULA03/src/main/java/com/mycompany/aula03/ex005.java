package com.mycompany.aula03;

import java.util.Scanner;

public class ex005 {
    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        int V[] = new int[4];
        System.out.print("1° VALOR: ");
        V[0] = read.nextInt();
        System.out.print("2° VALOR: ");
        V[1] = read.nextInt();
        System.out.print("3° VALOR: ");
        V[2] = read.nextInt();
        System.out.print("4° VALOR: ");
        V[3] = read.nextInt();
        armazena_matriz(V);
    }
    
    static void armazena_matriz(int V[]) {
        int V2[] = new int[4];
        for(int i=3;i>=0;i--) V2[i] = V[i]*2;
        print(V2);
     }
    
    static void print(int V2[]) {
        System.out.println(" ");
        for(int i=0;i<4;i++) System.out.println(i+1+"° VALOR: "+V2[i]);
    }
}
