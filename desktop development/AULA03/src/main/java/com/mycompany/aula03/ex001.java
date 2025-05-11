package com.mycompany.aula03;

import java.util.Scanner;

public class ex001 {
    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        int value, returndouble, returntriple;
        System.out.print("Digite um valor: ");
        value = read.nextInt();
        returndouble = doublef(value);
        returntriple = triplef(value);
        System.out.println("Dobro: "+returndouble);
        System.out.println("Triplo: "+returntriple);
    }
    
    static int doublef(int value) {
        int doublev;
        doublev = value*2;
        return doublev;
    }
    
    static int triplef(int value) {
        int triplev;
        triplev= value*3;
        return triplev;
    }
}
