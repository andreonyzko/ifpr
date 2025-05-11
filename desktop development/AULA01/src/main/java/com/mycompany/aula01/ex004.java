package com.mycompany.aula01;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n, somap=0, somai=0, i=0;
        
        do{
          i++;
          System.out.println("Digite o digito "+i+":");
          n=leia.nextInt();
          if(n %2 ==0) somap= somap+n;
          else somai=somai+n;
        }while(n!=0);
        
        System.out.println("Soma dos pares: "+somap);
        System.out.println("Soma dos ímpares: "+somai);
    }
    
}
