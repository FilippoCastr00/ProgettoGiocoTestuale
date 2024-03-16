package Livello1;

import java.util.ArrayList;
import java.util.Scanner;

public class Livello1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> domandeFacili = new ArrayList<>();
        ArrayList<String> domandeMedie = new ArrayList<>();
        ArrayList<String> domandeDifficili = new ArrayList<>();
        ArrayList<String> domandeBonus = new ArrayList<>();

        int risposteCorrette = 0;
        int risposteSbagliate = 0;

        domandeFacili.add("In Java, quale parola chiave viene utilizzata per ereditare da una classe?");
        domandeFacili.add("Quale dei seguenti concetti descrive meglio l'ereditarietà?");
        domandeFacili
                .add("Qual è il termine utilizzato per indicare la classe da cui un'altra classe eredita in Java?");
        domandeFacili.add("In Java, una classe può avere genitori?");
        domandeFacili.add("In Java, una classe genitore può avere quanti figli?");

        domandeMedie.add("come va");
        domandeMedie.add("come va");
        domandeMedie.add("come va");
        domandeMedie.add("come va");
        domandeMedie.add("come va");

        domandeDifficili.add("tutto bene");
        domandeDifficili.add("tutto bene");
        domandeDifficili.add("tutto bene");
        domandeDifficili.add("tutto bene");
        domandeDifficili.add("tutto bene");

        System.out.println("quale difficoltà vuoi scegliere?");
        String risposta = sc.nextLine();

        for(int i = 1; i > 0;){
            if (risposta.equalsIgnoreCase("facile")) {
                System.out.println("In Java, quale parola chiave viene utilizzata per ereditare da una classe?");
                System.out.println("A)extends \n B)implements \n C)inherit \n D)derive");
                String sceltaRisposta = sc.nextLine();
                switch (sceltaRisposta) {
                    case "A":
                        System.out.println("Risposta corretta!");
                        risposteCorrette++;
                        i--;
                        break;
                    case "B":
                        System.out.println("Riposta sbagliata!");
                        risposteSbagliate++;
                        i--;
                        break;
                    case "C":
                        System.out.println("Riposta sbagliata!");
                        risposteSbagliate++;
                        i--;
                        break;
                    case "D":
                        System.out.println("Riposta sbagliata!");
                        risposteSbagliate++;
                        i--;
                        break;
                    default:
                        System.out.println("Devi inserire una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
    
            }
        }
        sc.close();

    }
}
