import java.util.ArrayList;

public abstract class Ereditarietà {
    // difficoltà delle domande
    String facile;
    String medio;
    String difficile;

    // arraylist in cui saranno contenute le domande
    protected ArrayList<String> domandeFacili = new ArrayList<>();
    protected ArrayList<String> domandeMedie = new ArrayList<>();
    protected ArrayList<String> domandeDifficili = new ArrayList<>();
    protected ArrayList<String> domandaBonus = new ArrayList<>();

    // metodo in cui l'utente sceglie il grado di difficoltà
    public String sceltaUtenteDifficoltà(String sceltaUtente) {
        return sceltaUtente;
    }
}