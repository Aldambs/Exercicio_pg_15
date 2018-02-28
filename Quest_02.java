package Exercicio_15;

import java.util.*;

public class Quest_02 {
 /**
 Faça um algoritmo para ler os coeficiente de uma equação do segundo grau
 e escreva o valor do seu delta.
 **/
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
        byte a, b, c;
        double delta;
        
        System.out.println("Entre com o coeficiente 'a' da equação do segundo grau:");
        a = ler.nextByte();
        System.out.println("Entre com o coeficiente 'b' da equação do segundo grau:");
        b = ler.nextByte();
        System.out.println("Entre com o coeficiente 'c' da equação do segundo grau:");
        c = ler.nextByte();
        
        delta = (Math.pow(b,2)) - 4 * a * c;
        
        System.out.println("Delta é:" +delta+ "\n");
        
    }
}
