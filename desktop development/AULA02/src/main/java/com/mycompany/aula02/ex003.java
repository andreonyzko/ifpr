package com.mycompany.aula02;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int p, media, cont, V[]= new int[5];
        
        for(int i=0; i<5; i++){
            cont= i+1;
            System.out.println("Digite o peso "+cont+":");
            p=leia.nextInt();
            V[i]=p;
        }
        
        media= (V[0] + V[1] + V[2] + V[3] + V[4])/5;
        System.out.println("A media é "+media);
    }
    
}
