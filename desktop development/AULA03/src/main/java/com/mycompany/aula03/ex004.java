package com.mycompany.aula03;

import java.util.Scanner;

public class ex004 {
    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        double g1, g2, g3, g4;
        char concept;
        System.out.print("1° BIMESTRE: ");
        g1 = read.nextDouble();
        System.out.print("2° BIMESTRE: ");
        g2 = read.nextDouble();
        System.out.print("3° BIMESTRE: ");
        g3 = read.nextDouble();
        System.out.print("4° BIMESTRE: ");
        g4 = read.nextDouble();
        concept = calcula_media(g1,g2,g3,g4);
        System.out.println("Conceito "+concept);
    }
    
    static char calcula_media(double g1, double g2, double g3, double g4) {
        char concept;
        double mean;
        mean = (g1+g2+g3+g4)/4;
        System.out.println("Média "+mean);
        concept = converte_conceito(mean);
        return concept;
    }
    
    static char converte_conceito(double mean) {
        char concept = 'A';
        if(mean < 7.0) concept = 'D';
        if(mean >= 7.0 && mean < 8.0) concept = 'C';
        if(mean >=8.0 && mean < 9.0) concept = 'B';
        if(mean >= 9) concept = 'A';
        return concept;
    }
}
