package _01_08_OTTOBRE._01_FACTORY_METHOD;

// Classe astratta Dialog che rappresenta un'interfaccia generica per una finestra di dialogo.
// Utilizza il pattern Factory Method per creare pulsanti senza specificare la classe concreta del pulsante.
public abstract class Dialog {

    // Metodo per renderizzare la finestra di dialogo con un pulsante "OK".
    public void renderWindow() {
        // Crea un'istanza di Button utilizzando il metodo factory.
        Button okButton = createButton();
        // Renderizza il pulsante nella finestra di dialogo.
        okButton.render();
    }

    // Metodo factory astratto che deve essere implementato dalle sottoclassi.
    // Restituisce un'istanza di Button (classe concreta definita nelle sottoclassi).
    public abstract Button createButton();
}

