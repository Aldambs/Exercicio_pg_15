package Exercicio_15;

import java.util.*;

public class Quest_04 {
    /*
     Faça um algoritmo para ler uma temperatura em graus Celsius e transformá - la 
     em farenheit. 
     */

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double celsius, farenheit;

        System.out.println("Informe a temperatura em grau celsius:");
        celsius = ler.nextDouble();

        farenheit = ((180 * celsius)/ 100) + 32;

        System.out.println("A temperatura é:" + farenheit + "\n");
    }

}
