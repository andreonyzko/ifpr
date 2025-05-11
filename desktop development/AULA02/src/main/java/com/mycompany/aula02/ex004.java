package com.mycompany.aula02;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int A[]= new int[5], B[]= new int[5], n;
        
        for(int i=0; i<5; i++){
            System.out.println("Digite A["+i+"]:");
            n=leia.nextInt();
            A[i]=n;
        }
        
        for(int i=0; i<5; i++){
            B[i]=A[i]*2;
            System.out.println("B["+i+"]: "+B[i]);
        }
    }
    
}
