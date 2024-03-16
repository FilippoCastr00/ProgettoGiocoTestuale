import java.util.*;

public class LivelloDue {

    ArrayList<String[]> setDomande = new ArrayList<>();

    public LivelloDue() {

    }

    Scanner sc = new Scanner(System.in);

    public void domande() {
        setDomande = new ArrayList<>();
        String[] domandeFacili = {
                "1)L'incapsulamento aiuta a nascondere i dettagli interni di implementazione di una classe?",
                "2)È obbligatorio usare sia getter che setter per ogni attributo privato in una classe per rispettare l'incapsulamento?",
                "3)Può l'incapsulamento ridurre il rischio di modifiche accidentali allo stato interno di un oggetto?",
                "4)I metodi pubblici di una classe violano il principio di incapsulamento?",
                "5)L'incapsulamento limita la capacità di un oggetto di interagire con altri oggetti?" };
        String[] domandeMedie = {};
        String[] domandeDifficili = {};
        setDomande.add(domandeFacili);
        setDomande.add(domandeMedie);
        setDomande.add(domandeDifficili);
        sceltaDifficoltà();

    }

    public void sceltaDifficoltà() {
        System.out.println("scegli una difficoltà: FACILE, , MEDIA , DIFFICILE");
        String difficoltà = sc.nextLine();
        switch (difficoltà) {
            case "facile":
                System.out.println("hai scelta la modalità facile ");
                String[] domandeScelte = setDomande.get(0);
                for (String strings : domandeScelte) {
                    System.out.println(strings);
                }
                break;
            case "media":
                System.out.println("hai scelta la modalità media");
                setDomande.get(1);
                break;
            case "difficile":
                System.out.println("hai scelta la modalità difficile");
                setDomande.get(2);
                break;
            default:
                break;
        }

    }
    /*
     * public void punteggio(){
     * 
     * }
     */

}