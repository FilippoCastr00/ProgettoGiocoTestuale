
import java.util.Scanner;

public class LevelThree {
  // Quindi qui scriviamo i metodi in cui far ciclare un'ArrayList dato
  // L'ArrayList dato sarà per ogni livello di difficoltà:
  // 1)Facile - 2)Intermedio - 3)Difficile
  static String[] facile = {
      "Il polimorfismo è una delle tre caratteristiche fondamentali dell’OOP?",
      "Il polimorfismo è anche una religione indonesiana?",
      "Il polimorfismo è la capacità di ereditare attributi e metodi?",
      "Il polimorfismo è presente solo in java?",
      "Quale delle seguenti non è un vantaggio del polimorfismo?",
      "Il polimorfismo può essere utilizzato solo in linguaggi di programmazione orientati agli oggetti?"
  };

  static String[] reazioniRisposta = { "Bravo, risposta esatta!", "Sbagliato!" };

  public void modFacile() {

    int counter = 0;

    Scanner scanner = new Scanner(System.in);

    // 1
    System.out.println(facile[0]);
    String risposta1 = scanner.nextLine();
    if (risposta1.equals("vero")) {
      System.out.println(reazioniRisposta[0]);
      counter++;
    } else {
      System.out.println(reazioniRisposta[1]);
    }

    // 2
    System.out.println(facile[1]);
    String risposta2 = scanner.nextLine();
    if (risposta2.equals("vero")) {
      System.out.println(reazioniRisposta[1]);
    } else {
      System.out.println(reazioniRisposta[0]);
      counter++;
    }

    // 3
    System.out.println(facile[2]);
    String risposta3 = scanner.nextLine();
    if (risposta3.equals("vero")) {
      System.out.println(reazioniRisposta[1]);
    } else {

      System.out.println(reazioniRisposta[0]);
      counter++;
    }

    // 4
    System.out.println(facile[3]);
    String risposta4 = scanner.nextLine();
    if (risposta4.equals("vero")) {
      System.out.println(reazioniRisposta[1]);
    } else {

      System.out.println(reazioniRisposta[0]);
      counter++;
    }

    // 5
    System.out.println(facile[4]);
    System.out.println("1) Maggiore flessibilità nel design del software");
    System.out.println("2) Codice più generico e riutilizzabile ");
    System.out.println("3) Maggiore complessità nel codice");
    System.out.println("4) Maggiore modularità nel design del software");
    int risposta5 = scanner.nextInt();
    if (risposta5 == 3) {
      System.out.println(reazioniRisposta[0]);
      counter++;
    } else {

      System.out.println(reazioniRisposta[1]);
    }

    // 6 (domanda segreta)
    if (counter == 0) {
      System.out.println(facile[5]);
      System.out.println("DA CONTROLLARE");
      // QUESTA STRUTTURA VA CONTROLLATA
      String risposta6 = scanner.nextLine();
      risposta6 = scanner.nextLine();
      if (risposta6.equals("vero")) {
        System.out.println(reazioniRisposta[0]);
      } else {
        System.out.println(reazioniRisposta[1]);
        System.out.println("Game over!");
        System.out.println("Hai totalizzato " + counter + " punti!");
      }

    }
  }

  public String modIntermedio() {
    String x = "";
    return x;
  }

  public String modDifficile() {
    String x = "";
    return x;
  }

  public static void main(String[] args) {
    LevelThree ciao = new LevelThree();
    ciao.modFacile();
  }
}
