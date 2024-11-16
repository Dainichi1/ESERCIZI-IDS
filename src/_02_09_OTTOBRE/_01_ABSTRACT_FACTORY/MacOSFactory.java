package _02_09_OTTOBRE._01_ABSTRACT_FACTORY;


public class MacOSFactory implements GUIFactory { // Classe fabbrica per MacOS che implementa `GUIFactory`.

    @Override
    public Button createButton() { // Metodo per creare un bottone MacOS.
        return new MacOSButton(); // Ritorna un nuovo oggetto `MacOSButton`.
    }

    @Override
    public Checkbox createCheckbox() { // Metodo per creare una checkbox MacOS.
        return new MacOSCheckbox(); // Ritorna un nuovo oggetto `MacOSCheckbox`.
    }
}
