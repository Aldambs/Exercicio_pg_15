package Exercicio_15;

import java.util.Scanner;

public class Quest_05 {
    /**
     Faça um algoritmopara ler o preço de compra e o percentual de lucro desejado
     *por um vendedor e calcular o preço de venda.
     */
    public static void main(String[] args) {
        
        Scanner ent = new Scanner (System.in);
        double compra, venda, porcentagem;
        
        System.out.println("Informe o valor da compra do produto:");
        compra = ent.nextDouble();
        System.out.println("Informe a porcentagem de lucro:");
        porcentagem = ent.nextDouble();
        
        venda = compra + (compra * porcentagem)/100;
        
        System.out.println("Valor da venda é:" +venda+ "\n");
        
    }
    
}
