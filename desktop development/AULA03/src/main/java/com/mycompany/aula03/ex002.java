package com.mycompany.aula03;
import java.util.Scanner;

public class ex002 {
    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        int optionmenu;
        double temp, returnc;
        do{
          System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\nSistema de Conversão de Temperaturas \n              MENU\n1- Celsius para Kelvin\n2- Celsius para Fahrenheit\n3- Kelvin para Fahrenheit\n0- Sair\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\nOpção: ");
          optionmenu = read.nextInt();
          System.out.print("Temperatura a converter: ");
          temp = read.nextDouble();
          if (optionmenu == 0) break;
          if(optionmenu == 1) returnc = CtoKelvin(temp);
          if(optionmenu == 2) returnc = CtoFahrenheit(temp);
          else returnc = KtoFahrenheit(temp);
          System.out.println("Conversão: " + returnc);
        } while(optionmenu != 0);
    }
    
    static double CtoKelvin(double temp) {
        double conversion;
        conversion = temp+273;
        return conversion;
    }
    
    static double CtoFahrenheit(double temp) {
      double conversion;
      conversion = 1.8*temp+32;
      return conversion;
    }
    
    static double KtoFahrenheit(double temp) {
      double conversion;
      conversion = 1.8*(temp - 273)+32;
      return conversion;
    }
}
