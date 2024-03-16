package TextAdventure.Livello1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Livello1 {
    public static void main(String[] args) {
        Livello1 prova = new Livello1();
        prova.LivelloUno();
    }

    public void LivelloUno() {
        Scanner sc = new Scanner(System.in);

        // creo ArrayList per le domande segrete e lo riempio
        ArrayList<String> domandeBonus = new ArrayList<>();
        domandeBonus.add("Quante volte Mirko ha acceso la webcam in tutta la settimana?");
        domandeBonus.add("Quante volte ha laggato l'aula?");

        // CONTATORI
        int risposteCorrette = 0;
        int risposteSbagliate = 0;

        // Menu iniziale
        System.out.println("JAVA TEXT ADVENTURE");
        System.out.println("Benvenuto giovane developer");
        System.out.println("quale difficoltà vuoi scegliere?: \nfacile\nmedia\ndifficile ");
        String risposta = sc.nextLine();

        for (int i = 1; i > 0;) {
            
            if (risposta.equalsIgnoreCase("facile")) {
                System.out.println("In Java, quale parola chiave viene utilizzata per ereditare da una classe?");
                System.out.println("A)extends \n B)implements \n C)inherit \n D)derive");
                String sceltaRispostaFacile1 = sc.nextLine();

                // DOMANDA 1
                switch (sceltaRispostaFacile1) {
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

                // DOMANDA 2
                System.out.println("Quale dei seguenti concetti descrive meglio l'ereditarietà?");
                System.out.println(
                        "A)il processo di nascondere i dettagli di implementazione \n B)La creazione di interfacce utente grafice \n C)La possibilità di creare una nuova classe basata su una classe esistente \n D)L'esecuzione di codice in parallelo");
                String sceltaRispostaFacile2 = sc.nextLine();
                switch (sceltaRispostaFacile2) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;

                    case "B":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;

                    case "C":
                        System.out.println("Risposta giusta");
                        risposteCorrette++;
                        i = 0;
                        break;

                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;

                    default:
                        System.out.println("Devi inserire una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }

                // DOMANDA 3
                System.out.println(
                        "Qual è il termine utilizzato per indicare la classe da cui un'altra classe eredita in Java?");
                System.out.println("A)Classe figlia \n B)Superclasse \n C)Sottoclasse \n D)Interfaccia");
                String sceltaRipostaFacile3 = sc.nextLine();
                switch (sceltaRipostaFacile3) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;

                    case "B":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;

                    case "C":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;

                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // quarta domanda
                System.out.println("In Java, una classe può avere genitori?");
                System.out.println(
                        "A)Si, può avere molti genitori diretti \n B)No, le classi non sono come le persone \n C)Si, ma solo un genitore diretto \n D)No, le classi non possono avere nè genitori nè figli");
                String sceltaRipostaFacile4 = sc.nextLine();
                switch (sceltaRipostaFacile4) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;

                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // quinta domanda
                System.out.println("In Java, una classe genitore può avere quanti figli?");
                System.out.println(
                        "A)Solo uno, come nella vita reale \n B)Massimo due, per limitare la complessità \n C) Nessuno, le classi non possono avere figli \n D) Quanti ne vuole, non c'è limite");
                String sceltaRispostaFacile5 = sc.nextLine();
                switch (sceltaRispostaFacile5) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta giusta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
            }
            // difficoltà media prima domanda
            if (risposta.equalsIgnoreCase("media")) {
                System.out.println("1)Quale delle seguenti affermazioni è vera riguardo l'ereditarietà in Java?");
                System.out.println(
                        "A) Una classe può ereditare da più classi utilizzando la parola chiave extends. \n B) Java supporta l'ereditarietà multipla tramite classi. \n C) Una classe può implementare più interfacce. \n D) Una classe può estendere più di una classe alla volta.");
                String sceltaRispostaMedia1 = sc.nextLine();
                switch (sceltaRispostaMedia1) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // domanda media 2
                System.out.println("2)Come si può accedere ai membri della superclasse in una sottoclasse?");
                System.out.println(
                        "A) Usando direttamente il loro nome. \n B) Usando la parola chiave super. \n C) Usando la parola chiave this. \n D) Usando la parola chiave parent.");
                String sceltaRispostaMedia2 = sc.nextLine();
                switch (sceltaRispostaMedia2) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // domanda media 3
                System.out.println("3)Come si può impedire l'override di un metodo in una sottoclasse?");
                System.out.println(
                        "A) Marcando il metodo come private. \n B) Marcando il metodo come final. \n C) Non definendo il metodo nella superclasse. \n D) Dichiarando il metodo nella sottoclasse con un diverso tipo di ritorno.");
                String sceltaRispostaMedia3 = sc.nextLine();
                switch (sceltaRispostaMedia3) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // domanda media 4
                System.out.println("4)In quale scenario si utilizza l'ereditarietà in Java?");
                System.out.println(
                        "A) Per migliorare la performance del codice. \n B) Per ridurre la duplicazione del codice e migliorare la riutilizzabilità. \n C) Per incrementare la sicurezza del codice. \n D) Per convertire tipi di dati primitivi in oggetti.");
                String sceltaRispostaMedia4 = sc.nextLine();
                switch (sceltaRispostaMedia4) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // domanda media 5
                System.out.println(
                        "5)Quando si definisce un metodo in una sottoclasse che esiste già nella superclasse, questo processo è noto come:");
                System.out.println("A) Overloading \n B) Overcasting \n C) Overriding \n D) Overwriting");
                String sceltaRispostaMedia5 = sc.nextLine();
                switch (sceltaRispostaMedia5) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
            }
            // difficoltà difficile prima domanda
            if (risposta.equalsIgnoreCase("difficile")) {
                System.out.println(
                        "1)Considerando l'ereditarietà in Java, cosa significa quando un metodo della superclasse è dichiarato come protected?");
                System.out.println(
                        "A) Il metodo può essere accessibile solo all'interno della stessa classe. \n B) Il metodo può essere accessibile solo nelle classi figlie, non da altre classi nel pacchetto. \n C) Il metodo è accessibile nelle classi figlie e da altre classi nello stesso pacchetto. \n D) Il metodo non può essere sovrascritto dalle sottoclassi.");
                String sceltaRispostaDifficile1 = sc.nextLine();
                switch (sceltaRispostaDifficile1) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // domanda difficile 2
                System.out.println(
                        "2)Qual è il risultato di marcare un metodo come abstract in una classe non astratta in Java?");
                System.out.println(
                        "A) Compilazione riuscita, ma il metodo non può essere invocato. \n B) Errore di compilazione. \n C) Il metodo può essere invocato solo dalle sottoclassi. \n D) Il metodo diventa opzionale nelle sottoclassi.");
                String sceltaRispostaDifficile2 = sc.nextLine();
                switch (sceltaRispostaDifficile2) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // domanda difficile 3
                System.out.println("3)Quali membri di una classe sono ereditati da una sottoclasse in Java?");
                System.out.println(
                        "A) Solo i membri public e protected. \n B) Tutti i membri, esclusi quelli marcati come private. \n C) Solo i membri public.v \n D) Tutti i membri, inclusi i campi private, ma questi ultimi non sono accessibili direttamente.");
                String sceltaRispostaDifficile3 = sc.nextLine();
                switch (sceltaRispostaDifficile3) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // domanda difficile 4
                System.out.println(
                        "4)Quale delle seguenti affermazioni è vera riguardo all'overloading e all'override di metodi in Java?");
                System.out.println(
                        "A) L'overloading consente di cambiare il tipo di ritorno del metodo. \n B) L'override di un metodo consente di cambiarne i parametri. \n C) L'overloading avviene tra metodi nella stessa classe con lo stesso nome ma parametri diversi. \n D) L'override è un concetto applicabile solo alle variabili, non ai metodi.");
                String sceltaRispostaDifficile4 = sc.nextLine();
                switch (sceltaRispostaDifficile4) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // domanda difficile 5
                System.out.println("5)Qual è l'effetto di dichiarare una classe come abstract in Java?");
                System.out.println(
                        "A) La classe non può essere istanziata, ma può essere estesa. \n B) La classe può essere istanziata solo se tutti i metodi astratti vengono implementati al momento dell'istanziazione. \n C) La classe può essere istanziata, ma non può essere usata come tipo di riferimento. \n D) La classe astratta non può contenere metodi concreti.");
                String sceltaRispostaDifficile5 = sc.nextLine();
                switch (sceltaRispostaDifficile5) {
                    case "A":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
            } else if (risposta.equalsIgnoreCase("goku")) {

                System.out.println(
                        "1)Considerando l'ereditarietà in Java, cosa significa quando un metodo della superclasse è dichiarato come protected?");
                System.out.println(
                        "A) Il metodo può essere accessibile solo all'interno della stessa classe. \n B) Il metodo può essere accessibile solo nelle classi figlie, non da altre classi nel pacchetto. \n C) Il metodo è accessibile nelle classi figlie e da altre classi nello stesso pacchetto. \n D) Il metodo non può essere sovrascritto dalle sottoclassi.");
                String sceltaRispostaDifficile1 = sc.nextLine();
                switch (sceltaRispostaDifficile1) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // domanda difficile 2
                System.out.println(
                        "2)Qual è il risultato di marcare un metodo come abstract in una classe non astratta in Java?");
                System.out.println(
                        "A) Compilazione riuscita, ma il metodo non può essere invocato. \n B) Errore di compilazione. \n C) Il metodo può essere invocato solo dalle sottoclassi. \n D) Il metodo diventa opzionale nelle sottoclassi.");
                String sceltaRispostaDifficile2 = sc.nextLine();
                switch (sceltaRispostaDifficile2) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // domanda difficile 3
                System.out.println("3)Quali membri di una classe sono ereditati da una sottoclasse in Java?");
                System.out.println(
                        "A) Solo i membri public e protected. \n B) Tutti i membri, esclusi quelli marcati come private. \n C) Solo i membri public.v \n D) Tutti i membri, inclusi i campi private, ma questi ultimi non sono accessibili direttamente.");
                String sceltaRispostaDifficile3 = sc.nextLine();
                switch (sceltaRispostaDifficile3) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // domanda difficile 4
                System.out.println(
                        "4)Quale delle seguenti affermazioni è vera riguardo all'overloading e all'override di metodi in Java?");
                System.out.println(
                        "A) L'overloading consente di cambiare il tipo di ritorno del metodo. \n B) L'override di un metodo consente di cambiarne i parametri. \n C) L'overloading avviene tra metodi nella stessa classe con lo stesso nome ma parametri diversi. \n D) L'override è un concetto applicabile solo alle variabili, non ai metodi.");
                String sceltaRispostaDifficile4 = sc.nextLine();
                switch (sceltaRispostaDifficile4) {
                    case "A":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // domanda difficile 5
                System.out.println("5)Qual è l'effetto di dichiarare una classe come abstract in Java?");
                System.out.println(
                        "A) La classe non può essere istanziata, ma può essere estesa. \n B) La classe può essere istanziata solo se tutti i metodi astratti vengono implementati al momento dell'istanziazione. \n C) La classe può essere istanziata, ma non può essere usata come tipo di riferimento. \n D) La classe astratta non può contenere metodi concreti.");
                String sceltaRispostaDifficile5 = sc.nextLine();
                switch (sceltaRispostaDifficile5) {
                    case "A":
                        System.out.println("Risposta corretta");
                        risposteCorrette++;
                        i = 0;
                        break;
                    case "B":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "C":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    case "D":
                        System.out.println("Risposta sbagliata");
                        risposteSbagliate++;
                        i = 0;
                        break;
                    default:
                        System.out.println("devi scegliere una tra le risposte a tua disposizione");
                        i = 1;
                        break;
                }
                // domanda segreta
                System.out.println("zzzzzzzzz");
                Random random = new Random();
                int randomNumber = random.nextInt(2);
                for (int j = 0; j <= randomNumber;) {
                    if (j == randomNumber) {
                        System.out.println(domandeBonus.get(j));
                        break;
                    }
                    j++;

                }

            }
            
        }
        // Stampa il conteggio delle domande giuste\sbagliate + GOKU
        if (risposteCorrette == 5) {
            Disegno disegno = new Disegno();
            disegno.disegnoGoku();
        }
        System.out.println("Risposte corrette : " + risposteCorrette);
        System.out.println("Risposte sbagliate: " + risposteSbagliate);

    }

}
