package _02_09_OTTOBRE._01_ABSTRACT_FACTORY;


public class WindowsFactory implements GUIFactory { // Classe fabbrica per Windows che implementa `GUIFactory`.

    @Override
    public Button createButton() { // Metodo per creare un bottone Windows.
        return new WindowsButton(); // Ritorna un nuovo oggetto `WindowsButton`.
    }

    @Override
    public Checkbox createCheckbox() { // Metodo per creare una checkbox Windows.
        return new WindowsCheckbox(); // Ritorna un nuovo oggetto `WindowsCheckbox`.
    }
}

