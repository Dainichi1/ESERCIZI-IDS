package _01_08_OTTOBRE._01_FACTORY_METHOD;

// Classe HtmlButton che implementa l'interfaccia Button.
// Rappresenta un pulsante HTML che può essere renderizzato e cliccato.
public class HtmlButton implements Button {

    // Metodo per renderizzare il pulsante HTML.
    // Stampa un elemento <button> e invoca il metodo onClick().
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    // Metodo che definisce l'azione da eseguire quando si clicca sul pulsante.
    // In questo caso, stampa un messaggio di saluto.
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
