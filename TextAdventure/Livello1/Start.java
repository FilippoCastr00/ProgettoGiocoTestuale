package Livello1;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Disegno javaDisegno = new Disegno();
        javaDisegno.disegnoJava();

        for (int i = 1; i > 0;) {
            System.out.println(" Benvenuti nel nostro fantastico gioco! Scegli un'opzione:");
            System.out.println(" 1. Inizia il gioco");
            System.out.println(" 2. Esci");
            int rispostaMenu = scanner.nextInt();

            if (rispostaMenu == 1) {
                Livello1 startLivelli = new Livello1();
                startLivelli.Livello1();
            } else if (rispostaMenu == 2) {
                System.exit(0);
            } else {
                System.out.println("Le uniche opzioni accettate sono 1 o 2");
            }

        }

    }

}
