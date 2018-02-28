package Exercicio_15;

import java.util.Scanner;

public class Quest_07 {
    /**
     Faça um algoritmo para ler o horário de entrada e saída de um cliente na 
     fila de um banco e seguida calcular o tempo de permanência do cliente na fila.
     Cada horário será lido em duas variáveis inteiras representado a hora
     e os minutos. A resposta deve ser dada em horas.
     */
    public static void main(String[] args) {
       
       Scanner ler = new Scanner(System.in);
       int tempo_per, tempo_sai, tempo_ent;
       int h1, m1,  h2, m2, h_p, m_p;
       
        System.out.println("Digite o horário da entrada:");
        h1 = ler.nextInt();
        System.out.println("Digite o minuto da entrada:");
        m1 = ler.nextInt();
        
        System.out.println("Digite o horário da saida:");
        h2 = ler.nextInt();
        System.out.println("Digite o minuto da saida:");
        m2 = ler.nextInt();
         
        tempo_ent = h1*60 + m1;
        tempo_sai = h2*60 + m2;
        
        tempo_per = tempo_sai - tempo_ent;
        h_p = tempo_per / 60;
        m_p = tempo_per % 60;
        
        System.out.println("O tempo na fila: " +h_p+ " : " +m_p+ " ");
        
        
        
        
        
    }
    
}
