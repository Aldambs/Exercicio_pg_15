package Exercicio_15;

import java.util.*;

public class Quest_03 {
/*
    Faça um algoritmo para ler os catetos de um triângulo e escrevar a 
    hipotenusa.
*/
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in); 
        int a, b;
        double h;
        
        System.out.println("Digite o valor de a:");
        a = ent.nextInt();
        System.out.println("Digite o valor de b:");
        b = ent.nextInt();
        
        h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        System.out.println("A hipotenusa é:" +h);
        
        
    }
    
}
