/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author marcelo
 */
public class Calculadora {

  public double somar (double num1, double num2){
    return num1+num2;
  }
  public double subtrair (double num1, double num2){
    return num1-num2;
  }
  public double multiplicar (double num1, double num2){
    return num1*num2;
  }
  public double dividir (double num1, double num2){
      if(num2==0){
          System.out.println("Não é possível efetuar divisão por zero");
          return 0.0;
      }else {
          return num1/num2;
      }
    
  }
  
}
