package _01_08_OTTOBRE._01_FACTORY_METHOD;


// Classe concreta WindowsDialog che estende la classe astratta Dialog.
// Implementa il metodo factory per creare un pulsante specifico per l'ambiente Windows.
public class WindowsDialog extends Dialog {

    // Implementazione del metodo factory per creare un'istanza di WindowsButton.
    // Questo metodo restituisce un'istanza di WindowsButton, specifica per l'ambiente Windows.
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
