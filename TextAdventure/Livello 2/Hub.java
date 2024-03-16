public class Hub {
    public static void main(String[] args) {
      try {
        // creazione dell'oggetto LivelloDue nel hub
        LivelloDue livelloDue = new LivelloDue();
        // implementazione del metodo che fa partire il gioco
        livelloDue.quiz();
      } catch (Exception e) {
        System.out.println("non ti preocuppare è un'errore");
      }
        
    }
}
