import java.util.ArrayList;
import java.util.Scanner;

public class LevelThree {
  // Quindi qui scriviamo i metodi in cui far ciclare un'ArrayList dato
  // L'ArrayList dato sarà per ogni livello di difficoltà:
  // 1)Facile - 2)Intermedio - 3)Difficile
  // Come facciamo a stampare anche le risposte?
  ArrayList<String> facile = new ArrayList<String>();
  String[] intermedio = { "Vero o Falso", "Vero 2 o Falso 2", "Vero 3 o Falso 3", "Vero 4 o Falso 4",
      "Vero 5 o Falso 5", "Domanda Nascosta" };
  String[] difficile = { "1", "2", "3", "4", "5", "6" };

  public String modFacile() {
    String x = "";
    return x;
  }

  public void modIntermedio() {
    int counter = 0;
    // Domanda 1 VERO
    System.out.println("1)" + intermedio[0]);
    Scanner sc = new Scanner(System.in);// Prendo la risposta dello user // DEVE ESSERE VERA
    System.out.println("Rispondi VERO oppure FALSO");
    String intermedioAnswer = sc.nextLine();
    if (intermedioAnswer.equalsIgnoreCase("vero") || intermedioAnswer.equalsIgnoreCase("v")) {
      System.out.println("----------\nBravo, la risposta era VERA\n----------");
      counter++;
    } else {
      System.out.println("----------\nRisposta SBAGLIATA!!!!\n----------");
    }
    // Domanda 2 FALSO
    System.out.println("2)" + intermedio[1]);
    System.out.println("Rispondi VERO oppure FALSO");
    intermedioAnswer = sc.nextLine();
    if (intermedioAnswer.equalsIgnoreCase("falso") || intermedioAnswer.equalsIgnoreCase("f")) {
      System.out.println("----------\nBravo, la risposta era FALSO\n----------");
      counter++;
    } else {
      System.out.println("----------\nRisposta SBAGLIATA!!!!\n----------");
    }
    // Domanda 3 FALSO
    System.out.println("3)" + intermedio[2]);
    System.out.println("Rispondi VERO oppure FALSO");
    intermedioAnswer = sc.nextLine();
    if (intermedioAnswer.equalsIgnoreCase("falso") || intermedioAnswer.equalsIgnoreCase("f")) {
      System.out.println("----------\nBravo, la risposta era FALSO\n----------");
      counter++;
    } else {
      System.out.println("----------\nRisposta SBAGLIATA!!!!\n----------");
    }
    // Domanda 4 VERO
    System.out.println("4)" + intermedio[3]);
    System.out.println("Rispondi VERO oppure FALSO");
    intermedioAnswer = sc.nextLine();
    if (intermedioAnswer.equalsIgnoreCase("vero")) {
      System.out.println("----------\nBravo, la risposta era VERO\n----------");
      counter++;
    } else {
      System.out.println("----------\nRisposta SBAGLIATA!!!!\n----------");
    }
    // Domanda 5 FALSO
    System.out.println("5)" + intermedio[4]);
    System.out.println("----------\nRispondi VERO oppure FALSO\n----------");
    intermedioAnswer = sc.nextLine();
    if (intermedioAnswer.equalsIgnoreCase("falso")) {
      System.out.println("----------\nBravo, la risposta era FALSO\n----------");
      counter++;
    } else {
      System.out.println("----------\nRisposta SBAGLIATA!!!!\n----------");
    }
    // Domanda 6
    if (counter == 0) {
      System.out.println("Woosh! Hai sbloccato la DOMANDA SEGRETA!");
      System.out.println("Hai sbloccato questa domanda perchè i tuoi punti di questo livello ammontano a: " + counter);
      System.out.println("6)" + intermedio[5]);
    } else {
      System.out.println("Sei arrivato alla fine del gioco!\n I tuoi punti di questo livello ammontano a: " + counter);
    }
  }

  public void modDifficile() {
    int counterPunti = 0;
    Scanner myScan = new Scanner(System.in);
    System.out.println(difficile[0] + "rispondi con si o no");
    String risposta1 = myScan.nextLine();
    if (risposta1.equalsIgnoreCase("si")) {
      System.out.println("bravo,la risposta è vera");
      counterPunti++;
    } else {
      System.out.println("risposta sbagliata");
    }
    System.out.println(difficile[1] + "rispondi con si o no");
    String risposta2 = myScan.nextLine();
    if (risposta2.equalsIgnoreCase("no")) {
      System.out.println("bravo,la risposta è vera");
      counterPunti++;
    } else {
      System.out.println("risposta sbagliata");
    }
    System.out.println(difficile[2] + "rispondi con si o no");
    String risposta3 = myScan.nextLine();
    if (risposta3.equalsIgnoreCase("si")) {
      System.out.println("bravo,la risposta è vera");
      counterPunti++;
    } else {
      System.out.println("risposta sbagliata");
    }
    System.out.println(difficile[3] + "rispondi con si o no");
    String risposta4 = myScan.nextLine();
    if (risposta4.equalsIgnoreCase("si")) {
      System.out.println("bravo,la risposta è vera");
      counterPunti++;
    } else {
      System.out.println("risposta sbagliata");
    }
    System.out.println(difficile[4] + "metti la risposta corretta");
    String risposta5 = myScan.nextLine();
    if (risposta5.equals("2")) {
      System.out.println("bravo,la risposta è giusta");
      counterPunti++;
    } else {
      System.out.println("risposta sbagliata");
    }
    if (counterPunti == 0) {
      System.out.println("hai sbagliato tutte le risposte,questo sblocca la domanda segreta");
      System.out.println(difficile[5]);
      String rispostaSegreta = myScan.nextLine();
    } else {
      System.out.println("Hai finito complimenti, i tuoi punti sono: " + counterPunti);
    }

  }

}
