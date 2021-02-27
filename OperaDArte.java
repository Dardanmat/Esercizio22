package esercizi.esercizio22;

/**
* Tutte le opere d’arte hanno:
* <ul>
*   <li>informazioni: titolo, artista, quotazione</li>
*   <li>uno o più costruttori parametrici (almeno il titolo dell’opera deve sempre essere valorizzato)</li>
*   <li>un metodo che restituisce il valore dell’ingombro</li>
*   <li>un metodo che restituisce una stringa con le informazioni dell’opera</li>
* </ul>
*/

public abstract class OperaDArte {
    protected String titolo;
    protected String artista;
    protected String informazioniOpera;
    protected double quotazione;
    
    /**
     * Metodo che restituisce lo spazio che occupa l'opera.
     * @return m^3 o m^2 che vengono occupati dall'opera.
     */
    public abstract double calcolaIngombro();
    
    /**
     * Metodo che restituisce il tipo dell'oggetto.
     * @return enum Tipo, il tipo di appartenenza della classe.
     */
    public abstract Tipo getTipo();
    
    /**
     * Per inizializzare le propietà della classe.
     * @param titolo il titolo dell'opera.
     * @param artista il nome dell'artista che ha fatto l'opera.
     * @param informazioniOpera informazioni sull'opera.
     * @param quotazione prezzo al quale è quotata l'opera(€).
     */
    public void setProp(String titolo, String artista, String informazioniOpera, double quotazione){
        this.titolo = titolo;
        this.artista = artista;
        this.informazioniOpera = informazioniOpera;
        this.quotazione = quotazione;
    }
    
    /**
     * Metodo per inizializzare le propietà della classe a vuoto.
     */
    public void setProp(){
        this.titolo = "";
        this.artista = "";
        this.informazioniOpera = "";
        this.quotazione = 0;
    }
    
    /**
     * Metodo per copiare le propietà della classe.
     * @param op Oggetto da cui copiare le propietà.
     */
    public void setProp(OperaDArte op){
        this.titolo = op.titolo;
        this.artista = op.artista;
        this.informazioniOpera = op.informazioniOpera;
        this.quotazione = op.quotazione;
    }

    /**
     * Equals che controlla il titolo dell'opera.
     * @param obj vengono trattati sia oggetti OperaDArte sia stringhe contenenti il titolo.
     * @return <p>True se gli oggetti sono gli stessi<br>False se sono diversi</p>
     */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof OperaDArte){
            return ((OperaDArte) obj).titolo.equals(this.titolo);
        }
        if(obj instanceof String){
            return ((String)obj).equals(titolo);
        }
        return false;
    }
    
}
