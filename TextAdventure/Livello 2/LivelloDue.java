import java.util.*;

public class LivelloDue {

    ArrayList<String[]> setDomande = new ArrayList<>();

    public LivelloDue() {

    }

    // import dello scanner
    Scanner sc = new Scanner(System.in);

    // metodo domande() che verrà utilizzato nel main principale del proggetto .
    // è il main del secondo livello
    public void domande() {
        // creazione dell'ArrayList
        setDomande = new ArrayList<>();
        // creazione dei 3 array che contengono le domande in base alla difficoltà
        String[] domandeFacili = {
                "1) L’incapsulamento è una delle 3 regole fondamentali dell’OOP?",
                "2) L'incapsulamento aiuta a nascondere i dettagli interni di implementazione di una classe?",
                "3) L’incapsulamento è totalmente in mano al programmatore?",
                "4) I metodi pubblici di una classe violano il principio di incapsulamento?",
                "5) L'incapsulamento limita la capacità di un oggetto di interagire con altri oggetti? " };
        String[] domandeMedie = {
                "1) Può l'incapsulamento ridurre il rischio di modifiche accidentali allo stato di un oggetto? ",
                "2) È obbligatorio usare sia getter che setter per ogni attributo privato di una classe per rispettare l'incapsulamento?",
                "3) È possibile implementare l'incapsulamento in un linguaggio di programmazione che non supporta il concetto di classi?",
                "4) La dichiarazione di tutti gli attributi di una classe come public va contro i principi dell'incapsulamento? ",
                "5) L'incapsulamento può essere utilizzato per imporre invariati di classe mantenendo alcuni attributi costantemente in uno stato valido? " };
        String[] domandeDifficili = {
                "1) È corretto affermare che l'incapsulamento impedisce completamente l'accesso ai dati privati da parte di codice esterno alla classe?",
                "2) L'incapsulamento elimina la necessità di documentare gli attributi privati di una classe, dato che non sono esposti direttamente all'utente?",
                "3) L'incapsulamento può essere utilizzato per creare classi completamente immutabili?",
                "4) Gli oggetti immutabili in Java sono un esempio di incapsulamento?",
                "5) In un contesto di ereditarietà, è possibile che una sottoclasse modifichi gli attributi privati della sua classe genitore, senza passare attraverso metodi pubblici o protetti, mantenendo i principi dell'incapsulamento?" };
        // aggiungiamo gli array nell'ArrayList
        setDomande.add(domandeFacili);
        setDomande.add(domandeMedie);
        setDomande.add(domandeDifficili);
        // richiamo del metodo sceltaDifficoltà
        sceltaDifficoltà();

    }

    // metodo scelta difficoltà() che serve a far sceglieri la difficoltà ,
    // stampando le domande in base ad'essa.
    // consente anche le risposte dell'utente
    public void sceltaDifficoltà() {
        System.out.println("scegli una difficoltà: FACILE, , MEDIA , DIFFICILE");
        String difficoltà = sc.nextLine();
        switch (difficoltà) {
            // modalità facile
            case "facile":
                System.out.println("hai scelta la modalità facile ");

                // creo un nuovo array e lo assegno al primo array dell'ArrayList all'indice 0
                String[] domandeScelte = setDomande.get(0);

                // attraverso un ciclo for:each prendo le single stringhe all'interno dell'array
                for (String strings : domandeScelte) {

                    // stampo le domande all'utente e lo faccio rispondere
                    System.out.println(strings);
                    String risposta1 = sc.nextLine();

                    // creo un'array vuoto
                    String[] x = {};

                    // creo un'ArrayList e converto l'array x in un ArrayList attraverso il metodo
                    // asList()
                    ArrayList<String> risposte1 = new ArrayList<String>(Arrays.asList(x));

                    // aggiunge le risposte dell'utente nell'ArrayList
                    risposte1.add(risposta1);

                    // riconverto l'ArrayList in un array con il metodo toArray()
                    x = risposte1.toArray(x);
                }
                break;
            // modalità media
            case "media":
                System.out.println("hai scelta la modalità media");
                String[] domandeScelte2 = setDomande.get(1);
                for (String string : domandeScelte2) {
                    System.out.println(string);
                    String risposta2 = sc.nextLine();
                    String[] y = {};
                    ArrayList<String> risposte2 = new ArrayList<String>(Arrays.asList(y));
                    risposte2.add(risposta2);
                    y = risposte2.toArray(y);
                }

                break;
            // modalità difficile
            case "difficile":
                System.out.println("hai scelta la modalità difficile");
                String[] domandeScelte3 = setDomande.get(2);
                for (String string : domandeScelte3) {
                    System.out.println(string);
                    String risposta3 = sc.nextLine();
                    String[] z = {};
                    ArrayList<String> risposte3 = new ArrayList<String>(Arrays.asList(z));
                    risposte3.add(risposta3);
                    z = risposte3.toArray(z);
                }

                break;
            default:
                break;
        }

    }

    // metodo per controllare il punteggio
    public void punteggio() {
        // creazione degli array con le risposte alle domande
        String[] risposteFacili = { "si", "si", "no", "no", "no" };
        String[] risposteMedie = { "si", "no", "si", "no", "si" };
        String[] risposteDiffici = { "no", "no", "si", "si", "no" };
        int contatore = 0;

    }
}