package com.mycompany.aula02;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        int n, V[]= new int[5];
        
        System.out.println("Digite o digito inicial: ");
        n=leia.nextInt();
        
        for(int i=0; i<5; i++){
            V[i]=n;
            n= n+2;
        }
        
        for(int i=0; i<5; i++) System.out.println("V["+i+"]: "+V[i]);
    }
    
}
