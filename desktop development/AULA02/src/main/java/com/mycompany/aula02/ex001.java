package com.mycompany.aula02;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int V[] = new int[3], n, prod=1, posicao=0;
        
        for(int i=0; i<3; i++){
            posicao= i+1;
            System.out.println("Digite o valor da posição "+posicao+":");
            n=leia.nextInt();
            V[i]=n;
        }
        
        for(int i=0; i<3; i++){
            System.out.println("V["+i+"]: "+V[i]);
            prod= prod*V[i];
        }
        
        System.out.println("Produto dos digitos: "+prod);
    }
    
}
