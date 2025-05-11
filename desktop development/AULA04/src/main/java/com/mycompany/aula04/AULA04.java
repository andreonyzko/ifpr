package com.mycompany.aula04;
import java.util.Scanner;
public class AULA04 {

    public static void main(String[] args) {
        int account, agency, password;
        Scanner read = new Scanner(System.in);
        System.out.print("=-=-=-=- SINGUP -=-=-=-=\nAgencia: ");
        agency = read.nextInt();
        System.out.print("Conta: ");
        account = read.nextInt();
        System.out.print("Senha: ");
        password = read.nextInt();
        Conta c1 = new Conta(agency, account, password);
        System.out.print("=-=-=-==-=-=-=-=-==-=-=\n\n");
        int option;
        double value;
        do{
          System.out.print("=-=-=-=- AÇÕES -=-=-=-=\n1- Depositar\n2- Sacar\n3- Transferir\n4- Pagar Conta\n5-Verificar saldo\n\n0- Sair do APP\n=-=-=-=-=-=-=-=-=-=-=-=\nOpção: ");
          option = read.nextInt();
          if(option == 1){
            System.out.print("\nValor do depósito: R$");
            value = read.nextDouble();
            c1.setDeposito(value);
            System.out.println("Depóstio realizado.\n\n");
          }
          if(option == 2){
            System.out.print("\nValor do saque: R$");
            value = read.nextDouble();
            if(value > c1.saldo){
              System.out.print("Saldo insuficiente.\n\n");
            }
            else {
              c1.setSaque(value);
              System.out.print("Saque realizado.\n\n");
            }
          }
          if(option == 3){
            System.out.print("\nConta destino: ");
            read.nextInt();
            System.out.print("Valor da transferencia: R$");
            value = read.nextDouble();
            if(value > c1.saldo){
              System.out.print("Saldo insuficiente.\n\n");
            }
            else {
              c1.setTransferencia(value);
              System.out.print("Transferencia realizada.\n\n");
            }
          }
          if(option == 4){
            System.out.print("\nBoleto: ");
            read.nextInt();
            System.out.print("Valor: R$");
            value = read.nextDouble();
            if(value > c1.saldo){
              System.out.print("Saldo insuficiente.\n\n");
            }
            else {
              c1.setTransferencia(value);
              System.out.print("Boleto pago.\n\n");
            }
          }
            if(option == 5){
              System.out.println("Saldo disponível: R$"+c1.getSaldo()+"\n\n");
            }
            if(option != 1 && option != 2 && option != 3 && option != 4 && option != 5) {
              System.out.println("Opção invalida\n\n");
          }
        }while(option != 0);
    }
}
