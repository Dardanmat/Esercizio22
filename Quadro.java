package esercizi.esercizio22;

/**
* Le opere di tipo “quadro” hanno:
* <ul>
*    <li>informazioni: titolo, artista, quotazione, base e altezza</li>
*    <li>uno o più costruttori parametrici (almeno il titolo dell’opera e le misure di base e l’altezza devono essere valorizzate)</li>
*    <li>un metodo che restituisce il valore dell’ingombro (calcolo della superficie occupata)</li>
* </ul>
*/
public class Quadro extends OperaDArte{
    
    private static final Tipo TIPO= Tipo.QUADRO;
    
    private float base;
    private float altezza;

    /**
     * Costruttore di default per inizializzare tutte le propietà della classe.
     * @param base base del quadro
     * @param altezza altezza del quadro
     * @param titolo titolo del quadro
     * @param artista artista che ha dipinto il quadro
     * @param quotazione prezzo al quale è quotata l'opera
     * @param informazioniOpera informazioni sull'opera
     */
    public Quadro(float base, float altezza, String titolo, String artista, double quotazione, String informazioniOpera) {
        this.base = Math.abs(base);
        this.altezza = Math.abs(altezza);
        super.setProp(titolo, artista, informazioniOpera, quotazione);
    } 
    
    /**
     * Costruttore vuoto.
     */
    public Quadro() {
        this.base = 0;
        this.altezza = 0;
        super.setProp();
    }
    
    /**
     * Costruttore di copia.
     * @param q Oggetto Quadro da cui copiare le propietà
     */
    public Quadro(Quadro q) {
        this.base = q.base;
        this.altezza = q.altezza;
        super.setProp(q);
    }

    /**
     * Calcolo della superficie del quadro, per sapere quanto spazio occupa su una parete
     * @return la superficie del quadro in m^2
     */
    @Override
    public double calcolaIngombro() {
        return base*altezza;
    }

    /**
     * Ritorta il l'enum Tipo che indica il tipo della classe
     * @return ritorna QUADRO
     */
    @Override
    public Tipo getTipo() {
        return TIPO;
    }    
}
