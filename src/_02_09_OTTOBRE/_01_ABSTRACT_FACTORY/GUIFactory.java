package _02_09_OTTOBRE._01_ABSTRACT_FACTORY;


public interface GUIFactory { // Dichiarazione dell'interfaccia della fabbrica GUI.
    Button createButton(); // Metodo per creare un bottone.
    Checkbox createCheckbox(); // Metodo per creare una checkbox.
}
