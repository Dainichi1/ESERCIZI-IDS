package _01_08_OTTOBRE._01_FACTORY_METHOD;

// Classe concreta HtmlDialog che estende la classe astratta Dialog.
// Implementa il metodo factory per creare un pulsante specifico per l'ambiente HTML.
public class HtmlDialog extends Dialog {

    // Implementazione del metodo factory per creare un'istanza di HtmlButton.
    // Questo metodo restituisce un'istanza di HtmlButton, specifica per l'ambiente HTML.
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
