package com.mycompany.aula01;

import java.util.Scanner;

public class ex005 {

    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        int p, menorp=0, maiorp=0;
        for(int i=1; i<6; i++){
            
            System.out.println("Digite o peso da pessoa "+i+":");
            p=leia.nextInt();
            if(i==1){
              menorp=p;
              maiorp=p;
            }
            else{
              if(p>=maiorp) maiorp=p;
              if(p<=menorp) menorp=p;
            }
          }
        
        System.out.println("Maior peso: "+maiorp);
        System.out.println("Menor peso: "+menorp);
    }
    
}
