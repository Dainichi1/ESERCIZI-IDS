package _02_09_OTTOBRE._01_ABSTRACT_FACTORY;


public class Application { // Dichiarazione della classe principale dell'applicazione.
    private Button button; // Dichiarazione di un oggetto `Button`.
    private Checkbox checkbox; // Dichiarazione di un oggetto `Checkbox`.

    // Costruttore della classe `Application`, accetta una fabbrica GUI (GUIFactory).
    public Application(GUIFactory factory) {
        button = factory.createButton(); // Assegna un bottone usando il metodo della fabbrica.
        checkbox = factory.createCheckbox(); // Assegna una checkbox usando il metodo della fabbrica.
    }

    // Metodo che dipinge il bottone e la checkbox.
    public void paint() {
        button.paint(); // Chiama il metodo `paint` del bottone.
        checkbox.paint(); // Chiama il metodo `paint` della checkbox.
    }
}

