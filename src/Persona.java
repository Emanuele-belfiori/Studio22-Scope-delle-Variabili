public class Persona {

    //SCOPE DELLE VARIABILI:

    // CLSSE CRETA: ORA LAVORIAMO SULLA CLASSE PERSONA INSERENDO LE CARATTERISTICHE

    // Attributi ma solo dichiarati = caratteristiche della classe
    String nome;
    String cognome;
    int eta;
    String coloPreferito;

    // CREAZIONE DEL COSTRUTTORE.

    Persona(String nome, String cognome, int eta, String coloPreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.coloPreferito = coloPreferito;
    }

    //SCOPE GLOBALE: dimostrazione che possiamo accedere alle variabili che sono al di fuori dei metodi
    void saluta (){ // Richiamerò dal Main saluta per accertare che sia corretto e funzioni
        System.out.println("Ciao sono " + this.nome);
        // Abbiamo appurato che possiamo accedere alle variabili in qualsiasi metodo creiamo
    }

    // SCOPE LOCALE: dimostrazione di come possiamo accedere a una variabile all'interno di un metodo so
    //               nel metodo stesso, naturalmente richiamabile dal Main.
    void addizione (int a, int b){
        int risultato= a + b; // Creiamo la variabile risultato
        System.out.println("Il risultato è= " + risultato);
        this.calcolo(risultato);
    }

    /*
    SE CREIAMO UN ALTRO METODO DIFFERENTE E VOLESSIMO RICHIMARE IL RISULATTO DELLA VARIABILE DEL METODO
    ADDIZIONE QUESTO NON SAREBBE POSSIBILE PERCHÉ IL NUOVO METODO ADDIZIONE2 NON POTREBBE LEGGERE LA
    VARIABILE RISULTATO ESSENDO UNA SCOPE LOCALE (leggibile solo e soltanto nel metodo addizione).

    IL MODO PER OVVIARE A QUESTO PROBLEMA É: richiamare nel primo metodo addizione il secondo metodo
    calcolo passando nella parentesi (risultato), poi passeremo all'interno della parentesi del
    secondo metodo la variabile risultato come parametro (int prova), possiamo anche cambiare il
    nome volendo non cambierebbe nulla, successivamente manderemo a stampa e in questo modo, avremmo
    richiamato la variabile risultato e i relativi valori.
    In questo modo diventano due variabili distinte e diverse e lo dimostreremo nel Main.
     */
    void calcolo (int prova){ // Potremmo usare risultato/totale ecc.
        System.out.println("Da risultato: il risultato è= " + prova);// Potremmo usare risultato/totale ecc.

        // Possiamo anche implementare con un'altra variabile il metodo calcolo e mandare a schermo entrambe:
        int risultato= 250; /* Dimostrazione della creazione di un'altra variabile con lo stesso nome del
                               precedente metodo, come si vede non crea nessun errore */
        System.out.println("Da risultato: risultato2 è= " + risultato);// Altra variabile risultato
    }
}
