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
                "1) L'incapsulamento aiuta a nascondere i dettagli interni di implementazione di una classe?",
                "2) È obbligatorio usare sia getter che setter per ogni attributo privato in una classe per rispettare l'incapsulamento?",
                "3) Può l'incapsulamento ridurre il rischio di modifiche accidentali allo stato interno di un oggetto?",
                "4) I metodi pubblici di una classe violano il principio di incapsulamento?",
                "5) L'incapsulamento limita la capacità di un oggetto di interagire con altri oggetti?" };
        String[] domandeMedie = {
                "1) Può l'incapsulamento ridurre il rischio di modifiche accidentali allo stato di un oggetto? ",
                "2) È obbligatorio usare sia getter che setter per ogni attributo privato di una classe per rispettare l'incapsulamento?",
                "3) È possibile implementare l'incapsulamento in un linguaggio di programmazione che non supporta il concetto di classi?",
                "4) La dichiarazione di tutti gli attributi di una classe come public va contro i principi dell'incapsulamento? ",
                "5) L'incapsulamento può essere utilizzato per imporre invariati di classe mantenendo alcuni attributi costantemente in uno stato valido? " };
        String[] domandeDifficili = {
                "1) È corretto affermare che l'incapsulamento impedisce completamente l'accesso ai dati privati da parte di codice esterno alla classe?",
                "2) L'incapsulamento elimina la necessità di documentare gli attributi privati di una classe, dato che non sono esposti direttamente all'utente?",
                "3) L'incapsulamento può essere utilizzato per creare classi completamente immutabili?" };
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
            case "facile":
                System.out.println("hai scelta la modalità facile ");
                String[] domandeScelte = setDomande.get(0);
                for (String strings : domandeScelte) {
                    System.out.println(strings);


                    
             // !!!!!!!!!!!!      String[] risposte1 = new String[sc.];

                }
                break;
            case "media":
                System.out.println("hai scelta la modalità media");
                String[] domandeScelte2 = setDomande.get(1);
                for (String string : domandeScelte2) {
                    System.out.println(string);
                    String risposta2 = sc.nextLine();
                }

                break;
            case "difficile":
                System.out.println("hai scelta la modalità difficile");
                String[] domandeScelte3 = setDomande.get(2);
                for (String string : domandeScelte3) {
                    System.out.println(string);
                    String risposta3 = sc.nextLine();
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
        String[] risposteDiffici = { "no", "no", "si", "", "" };
    }
}