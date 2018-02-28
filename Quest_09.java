package Exercicio_15;

import java.util.Scanner;

public class Quest_09 {
    /**
    Faça um algoritmo para ler o horário(h, m, s) de inicio e a duração, em 
    segundos, de uma experiência biologica, em seguida informar o horário (h, m, s)
    de terminio da mesma.
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int h_e, m_e, s_e, h_f, m_f, s_f, dr_s, ter, ini, fim;
       
        System.out.println("Informe o horario de entrada:");
        h_e = ler.nextInt();
        m_e = ler.nextInt();
        s_e = ler.nextInt();
        System.out.println("Informe a duração da experiência");
        dr_s = ler.nextInt();

        ini = h_e*60 + m_e*60 + s_e; 
        ter = ini + dr_s;
        
        h_f = ter / 60;
        m_f = ter % 60;
        s_f = ter % 60;
        ter = ter / 60;
        
        System.out.println("Tempo final da experiência: " +h_f+ ":" +m_f+ ":" +s_f+ "");
    }
    
}
