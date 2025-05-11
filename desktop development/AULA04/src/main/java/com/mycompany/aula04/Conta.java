package com.mycompany.aula04;

public class Conta {
  int agencia, conta, senha;
  double saldo;
  
  Conta(int agency, int account, int password){
    agencia = agency;
    conta = account;
    senha = password;
    saldo = 0;
  }

  void setDeposito(double value){
    saldo = saldo + value;
  }

  void setSaque(double value){
    saldo = saldo - value;
  }

  void setTransferencia(double value){
    saldo = saldo - value;
  }

  void setPagConta(double value){
    saldo = saldo - value;
  }

  double getSaldo(){
    return saldo;
  }
}