/* Calculo do IMC
------------------------------------  
IMC = peso/altura² - Classificação
------------------------------------  
menor que 18,5 - Magreza
de 18,5 a 24,9 - Peso normal
de 25,0 a 29,9 - Sobrepeso
de 30,0 a 34,9 - Obesidade grau I
de 35,0 a 40,0 - Obesidade grau II
maior que 40,0 - Obesidade grau III */

import java.util.Scanner;

class CalculoIMC {
  public static void main(String[] args) {
    System.out.println("\nCalculo do IMC");

    try {
      Scanner leitura = new Scanner(System.in);
      float peso;
      float altura;

      // Entrada de dados
      System.out.print("\nInforme a sua altura (m): "); 
      altura = (float)leitura.nextDouble();
    
      System.out.print("\nInforme o seu peso (kg): "); 
      peso = (float)leitura.nextDouble();

      // Calculando IMC
      float resultado = Math.round(peso/(altura*altura));

      // Saida de dados
      System.out.println("\nIMC: " + resultado);   

      // Classificando IMC
      if (resultado < 18.5) {
         System.out.println("\nMagreza");
        } else if (resultado > 18.5 && resultado < 24.9) {
          System.out.println("\nPeso normal");
        } else if (resultado > 25.0 && resultado < 29.9) {
          System.out.println("\nSobrepeso");
        } else if (resultado > 30.0 && resultado < 34.9) {
          System.out.println("\nObesidade grau I");
        } else if (resultado > 35.0 && resultado < 40.0) {
          System.out.println("\nObesidade grau II");
        } else {
          System.out.println("\nObesidade grau III");
        }      
    } catch (Exception erro) {
        System.out.println("\nDesculpe, ocorreu um problema.");   
    }
  }
}
