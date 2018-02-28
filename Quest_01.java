package Exercicio_15;

import java.util.*;

public class Quest_01 {
/*
   Faça um algoritmo para ler três números inteiros e escrever a média
dos números lidos.
 */
    public static void main (String[] args){
       
        Scanner ent = new Scanner(System.in);
        byte n1, n2, n3;
        float media;
        
        System.out.println("Digite o primeiro número:");
        n1 = ent.nextByte();
        System.out.println("Digite o segundo número:");
        n2 = ent.nextByte();
        System.out.println("Digite o terceiro número:");
        n3 = ent.nextByte();
        
        media =(n1 + n2 + n3)/3;
        
        
        System.out.println("Média Final é:" +media+ "\n");
        
        
    }
}
