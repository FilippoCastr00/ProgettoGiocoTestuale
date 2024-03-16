import java.util.*;

public class LivelloDue {

    ArrayList<String []> setDomande = new ArrayList<>();

    public LivelloDue(){

    }

    public void domande(){

    setDomande = new ArrayList<>();
    String [] domandeFacili={""};
    String [] domandeMedie={};
    String [] domandeDifficili={};
    setDomande.add(domandeFacili);
    setDomande.add(domandeMedie);
    setDomande.add(domandeDifficili);
    }



public void sceltaDifficoltà(){
    System.out.println("scegli una difficoltà: FACILE, , MEDIA , DIFFICILE");

}
/*public void punteggio(){
    
} */

}