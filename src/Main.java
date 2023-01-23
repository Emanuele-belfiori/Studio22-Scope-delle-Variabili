public class Main {
    public static void main(String[] args) {
        System.out.println("Scope");
        System.out.println();

        /*
        * SCOPE DELLE VARIABILI:
        *
        * - Cos'è lo Scope?
        *
        * - Scope locale
        *
        * - Scope globle
         */

/*-------------------------------------------------------------------------------------------------------*/

        // COS'É LO SCOPE DELLE VARIABILI?
        /*
        Lo scope della variabile lo possiamo concepire come il raggio d'azione in cui la variabile è
        disponibile nel codice, cioè:
        In un programma possiamo trovare delle variabili, al di fuori di un metodo (come gli attributi)
        oppure quelle all'interno di un metodo, questa differenza di creazione delle variabili fa sì che
        il loro scope sia diverso.
        */
        //SCOPE GGLOBALE E LOCALE
        /*
        Scope= raggio d'azione in cui le variabili possono essere chiamate e lette, si dividono in:
        Globale= variabile fuori dal metodo ma all'interno della classe, viene definita locale perché è
                 richiamabile in tutta la classe quindi in qualsiasi metodo.
        Locale= all'interno di un metodo, viene definita locale perché esiste solo in quel metodo, non
                abbiamo infatti accesso al di fuori del metodo.
        */

/*--------------------------------------------------------------------------------------------------------*/

        Persona persona1 = new Persona("Emanuele", "Belfiori", 42, "Viola");
        persona1.saluta(); // Prova accertata che la variabile viene letta

        persona1.addizione(5, 5); // Richiamo metodo addizione
        /* Ora la stampa verrà effettuata con il metodo calcolo al quale è stata passata la variabile
           risultato dal metodo addizione */
        /* Abbiamo implementato di un'altra variabile risultato il metodo calcolo e abbiamo la dimostrazione
        / a video */


    }
}