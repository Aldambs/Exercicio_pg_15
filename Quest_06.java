package Exercicio_15;

import java.util.*;

public class Quest_06 {
  //Faça um algoritmo para ler duas variaveis inteiras e trocar o seu conteúdo.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2;
        int tro;
        
        System.out.println("Informe o primeiro valor:");
        num1 = ler.nextInt();
        System.out.println("Informe o segundo valor:");
        num2 = ler.nextInt();        
        
        tro = num1;
        num1 = num2;
        num2 = tro; 
        
        System.out.println("Agora o valor é: " +tro+ " " +num1+ " " +num2+ " ");
    }
    
}
