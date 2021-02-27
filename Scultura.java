package esercizi.esercizio22;

/**
* Le opere di tipo “scultura” hanno:
* <ul>
*    <li>informazioni: //, base, altezza e profondità</li>
*    <li>uno o più costruttori parametrici (almeno il titolo dell’opera e le misure di base e altezza devono essere valorizzate)</li>
*    <li>un metodo che restituisce il valore dell’ingombro (calcolo dell’area occupata)</li>
*    <li>un metodo che restituisce la superficie che la scultura occupa</li>
* </ul>
*/

public class Scultura extends OperaDArte{
    
    private static final Tipo TIPO= Tipo.SCULTURA;
    
    private float base;
    private float altezza;
    private float profondita;

    /**
     * Costruttore default.
     * @param base Base della scultura.
     * @param altezza Altezza della scultura.
     * @param profondita Lunghezza della scultura.
     * @param titolo Titolo dell'opera.
     * @param artista Artista che ha scolpito l'opera.
     * @param quotazione Prezzo a cui è quotata l'opera.
     * @param informazioniOpera Informazioni sull'opera.
     */
    public Scultura(float base, float altezza, float profondita, String titolo, String artista, double quotazione, String informazioniOpera) {
        this.base = Math.abs(base);
        this.altezza = Math.abs(altezza);
        this.profondita = Math.abs(profondita);
        super.setProp(titolo, artista, informazioniOpera, quotazione);
    }
    
    /**
     * Costruttore Vuoto.
     */
    public Scultura() {
        this.base = 0;
        this.altezza = 0;
        this.profondita = 0;
        super.setProp();
    }
    
    /**
     * Costruttore di copia.
     * @param s Oggetto da copiare.
     */
    public Scultura(Scultura s) {
        this.base = s.base;
        this.altezza = s.altezza;
        this.profondita = s.profondita;
        super.setProp(s);
    }

    public float getBase() {
        return base;
    }

    public float getAltezza() {
        return altezza;
    }

    public float getProfondita() {
        return profondita;
    }

    /**
     * Calcolo del volume della scoltura(trattata come un parallelepipedo rettangolo)
     * @return il volume in m^3
     */
    @Override
    public double calcolaIngombro() {
        return base*altezza*profondita;
    }
    
    /**
     * Calcola la superficie della base della statua (trattata come un rettangolo)
     * @return i m^2 della superficie della base
     */
    public double calcoloSuperficie(){
        return base*profondita;
    }
    
    /**
     * Ritorta il tipo della classe sotto forma di enum Tipo
     * @return SCULTURA
     */
    @Override
    public Tipo getTipo() {
        return TIPO;
    } 
   
}
