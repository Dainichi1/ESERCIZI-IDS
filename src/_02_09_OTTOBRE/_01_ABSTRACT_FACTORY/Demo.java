package _02_09_OTTOBRE._01_ABSTRACT_FACTORY;


public class Demo { // Dichiarazione della classe Demo, che contiene il metodo di configurazione e il main.

    // Metodo privato statico che configura l'applicazione in base al sistema operativo.
    private static Application configureApplication() {
        Application app; // Dichiarazione di un oggetto `Application`.
        GUIFactory factory; // Dichiarazione di una variabile `GUIFactory` per la fabbrica GUI.

        // Recupera il nome del sistema operativo dal sistema e lo converte in minuscolo.
        String osName = System.getProperty("os.name").toLowerCase();

        // Condizione per verificare se il sistema operativo è macOS.
        if (osName.contains("mac")) {
            factory = new MacOSFactory(); // Se il sistema è macOS, crea una fabbrica MacOS.
        } else {
            factory = new WindowsFactory(); // Altrimenti, crea una fabbrica per Windows.
        }

        app = new Application(factory); // Crea un'applicazione usando la fabbrica selezionata.
        return app; // Restituisce l'oggetto `Application` configurato.
    }

    // Metodo principale, punto di ingresso dell'applicazione.
    public static void main(String[] args) {
        Application app = configureApplication(); // Configura l'applicazione in base al sistema operativo.
        app.paint(); // Chiama il metodo `paint` dell'applicazione per renderizzare i componenti.
    }
}

