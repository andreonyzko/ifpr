package com.mycompany.aula01;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n, mult=1;
        
        for(int i=1;i<6;i++){
            System.out.println("Digite o digito "+i+":");
            n=leia.nextInt();
            mult= mult*n;
        }
        
        System.out.println("O produto dos digitos é: "+mult);
    }
}
