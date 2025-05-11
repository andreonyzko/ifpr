package com.mycompany.conversorbase;

import java.util.Scanner;

public class ConversorBase {
      public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int option=7;
        System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\nBem vindo ao sistema!\nEscolha uma opção de conversão:\n\n1- Decimal para binário;\n2- Decimal para octal;\n3- Decimal para hexadecimal;\n4- Binário para decimal;\n5- Octal para decimal;\n6- Hexadecimal para decimal.\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\nOpção: ");
        option = read.nextInt();
            
        if(option == 1 || option == 2 || option == 3){
        int number;
        System.out.print("Digite o número decimal: ");
        number = read.nextInt();

            if(option == 1){
                int V[] = new int[100000];
                int div, over, i=0;

                do{
                    div = number/2;
                    over = number%2;
                    V[i]= over;
                    i++;
                    number = div;
                }while(div > 0);

                System.out.print("Conversão: ");
                while(i>=0){
                    i--;
                    if(i>=0)
                    {
                    System.out.print(V[i]);
                    }
                }
            }

            if(option == 2){
                int div, over, i=0;
                int V[] = new int[1000000];

                do{
                    div = number/8;
                    over = number%8;
                    V[i]= over;
                    i++;
                    number = div;
                }while(div > 0);

                System.out.print("Conversão: ");
                while(i>=0){
                    i--;
                    if(i>=0)
                    {
                    System.out.print(V[i]);
                    }
                }
            }
            if(option == 3){
                int div, over, i=0;
                int V[] = new int[10000000];

                do{
                    div = number/16;
                    over = number%16;
                    V[i]= over;
                    i++;
                    number = div;
                }while(over > 0);

                V[i]= div;
                System.out.print("Conversão: ");
                while(i>=0){
                    if(V[i] == 10) System.out.print("A");
                    if(V[i] == 11) System.out.print("B");
                    if(V[i] == 12) System.out.print("C");
                    if(V[i] == 13) System.out.print("D");
                    if(V[i] == 14) System.out.print("E");
                    if(V[i] == 15) System.out.print("F");
                    if(V[i] < 10 && V[i] != 0) System.out.print(V[i]);
                    i--;
                }
            }
        }

        if(option == 4){
            char V[] = new char[1000];
            int number, i2=0;
            double potencia, result= 0.0;

            System.out.print("Digite o número binário: ");
            number = read.nextInt();

            String stringnumber = String.valueOf(number);
            char[] digits = stringnumber.toCharArray();

            for(int i = 0; i < digits.length; i++) V[i] = digits[i];
            
            for(int i = digits.length -1; i>=0; i--){
                if(V[i] != '0'){
                    potencia = Math.pow(2, i2);
                    result = result + potencia;
                }
                i2++;
            }

            System.out.println("Conversão: "+result);
        }

        if(option == 5){
            char V[] = new char[1000];
            int number, i2=0;
            double potencia, result= 0.0, mult;

            System.out.print("Digite o número octal: ");
            number = read.nextInt();

            String stringnumber = String.valueOf(number);
            char[] digits = stringnumber.toCharArray();

            for(int i = 0; i < digits.length; i++){         
                V[i] = digits[i];
            }

            for(int i = digits.length -1; i>=0; i--){
                if(V[i] != '0'){
                    potencia = Math.pow(8, i2);
                    number = Character.getNumericValue(V[i]);
                    mult = number * potencia;
                    result = result + mult;
                }
                i2++;
            }

            System.out.println("Conversão: "+result);
        }

        if(option == 6){
            char V[] = new char[1000];
            int number=0, i2=0;
            double potencia, result= 0.0, mult;

            System.out.print("Digite o número hexadecimal: ");
            read.nextLine();

            String stringnumber = read.nextLine();
            char[] digits = stringnumber.toCharArray();

            for(int i = 0; i < digits.length; i++) V[i] = digits[i];
            
            for(int i = digits.length -1; i>=0; i--){
                if(V[i] != '0'){
                    potencia = Math.pow(16, i2);
                    if(V[i] == 'A') number = 10;
                    if(V[i] == 'B') number = 11;
                    if(V[i] == 'C') number = 12;
                    if(V[i] == 'D') number = 13;
                    if(V[i] == 'E') number = 14;
                    if(V[i] == 'F') number = 15;
                    if (V[i] != 'A' && V[i] != 'B' && V[i] != 'C' && V[i] != 'D' && V[i] != 'E' && V[i] != 'F') number = Character.getNumericValue(V[i]);

                    mult = number * potencia;
                    result = result + mult;
                }
                i2++;
            }
            
            System.out.println("Conversão: "+result);
        }
    }
}
