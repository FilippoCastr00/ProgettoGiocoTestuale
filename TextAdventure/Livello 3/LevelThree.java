import java.util.ArrayList;
import java.util.Scanner;

public class LevelThree {
  // Quindi qui scriviamo i metodi in cui far ciclare un'ArrayList dato
  // L'ArrayList dato sarà per ogni livello di difficoltà:
  // 1)Facile - 2)Intermedio - 3)Difficile
  ArrayList<String> facile = new ArrayList<String>();
  ArrayList<String> intermedio = new ArrayList<String>();
  String [] difficile = {"1","2","3","4","5","6"};

  public String modFacile() {
    String x = "";
    return x;
  }

  public String modIntermedio() {
    String x = "";
    return x;
  }

  public void modDifficile() {
    int counterPunti=0;
    Scanner myScan = new Scanner(System.in);
    System.out.println(difficile[0]+"rispondi con si o no");
    String risposta1=myScan.nextLine();
    if(risposta1.equalsIgnoreCase("si")){
      System.out.println("bravo,la risposta è vera");
      counterPunti++;
    }else{
      System.out.println("risposta sbagliata");
    }
    System.out.println(difficile[1]+"rispondi con si o no");
    String risposta2=myScan.nextLine();
    if(risposta2.equalsIgnoreCase("no")){
      System.out.println("bravo,la risposta è vera");
      counterPunti++;
    }else{
      System.out.println("risposta sbagliata");
    }
    System.out.println(difficile[2]+"rispondi con si o no");
    String risposta3=myScan.nextLine();
    if(risposta3.equalsIgnoreCase("si")){
      System.out.println("bravo,la risposta è vera");
      counterPunti++;
    }else{
      System.out.println("risposta sbagliata");
    }
    System.out.println(difficile[3]+"rispondi con si o no");
    String risposta4=myScan.nextLine();
    if(risposta4.equalsIgnoreCase("si")){
      System.out.println("bravo,la risposta è vera");
      counterPunti++;
    }else{
      System.out.println("risposta sbagliata");
    }
    System.out.println(difficile[4]+"metti la risposta corretta");
    String risposta5=myScan.nextLine();
    if(risposta5.equals("2")){
      System.out.println("bravo,la risposta è giusta");
      counterPunti++;
    }else{
      System.out.println("risposta sbagliata");
    }
    if(counterPunti==0){
      System.out.println("hai sbagliato tutte le risposte,questo sblocca la domanda segreta");
      System.out.println(difficile[5]);
      String rispostaSegreta = myScan.nextLine();
    }else{
      System.out.println("Hai finito complimenti, i tuoi punti sono: "+counterPunti);
    }

  }
}
