package Exercicio_15;

import java.util.Scanner;

public class Quest_08 {

    /**
     * Faça um algoritmo para ler o valor do saque realizado pelo cliente de um
     * banco e escrever quantas notas de cada valor serão necessárias para
     * atender ao saque com a menor quantidade de notas possivel. Serão
     * utilizadas notas de 100, 50, 20, 5 e 1, reais.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int SA, N100, N50, N20, N10, N5, N1;

        System.out.println("Digite o valor a ser sacado:");
        SA = ler.nextInt();

        N100 = SA / 100;
        SA = SA % 100;
        N50 = SA / 50;
        SA = SA % 50;
        N20 = SA / 20;
        SA = SA % 20;
        N5 = SA / 5;
        SA = SA % 5;
        N1 = SA;

        System.out.println("Qtd de notas de 100 reais: " + N100);
        System.out.println("Qtd de notas de 50 reais: " + N50);
        System.out.println("Qtd de notas de 20 reais: " + N20);
        System.out.println("Qtd de notas de 5 real: " + N5);
        System.out.println("Qtd de notas de 1 real: " + N1);

    }

}
