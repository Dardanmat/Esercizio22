package esercizi.esercizio22;
import java.util.ArrayList;

/**
 *Classe contenitore che contiene un ArrayList di OpereDArte e dei metodi che permettono di usarlo. 
* <p>Implementare in Java delle opportune classi per gestire le opere d’arte di una collezione.<br>
* La collezione è identificata da un nome, un luogo e un insieme di opere d’arte.<br>
* La classe contenente la collezione dovrà esporre i seguenti opportuni metodi che permettano di sapere:</p>
* <ul>
*   <li>il nome dell’artista dell’opera più costosa.</li>
*   <li>la quantità di opere di tipo quadro e di opere di tipo scultura presenti nella collezione.</li>
*   <li>il valore totale della collezione.</li>
*   <li>il valore totale per ogni singola tipologia di opere.</li>
* </ul>
* 
* @author Dardan Matias Berisha
*/

public class Collezione {
    
    private String nome;
    private String luogo;
    private ArrayList<OperaDArte> opere;

    /**
     * Costruttore default, instanzia tutte le propietà dell'oggetto.
     * @param nome nome della collezione.
     * @param luogo luogo in cui si trova la collezione.
     * @param opere ArrayList che contiene oggetti figli di <code>OperaDArte</code>
     */
    public Collezione(String nome, String luogo, ArrayList<OperaDArte> opere) {
        this.nome = nome;
        this.luogo = luogo;
        this.opere = opere;
    }
    
    /**
     * Costruttore vuoto.
     */
    public Collezione() {
        this.nome = "";
        this.luogo = "";
        this.opere = new ArrayList<>();
    }
    
    /**
     * Costruttore di copia
     * @param c oggetto da copiare.
     */
    public Collezione(Collezione c) {
        this.nome = c.nome;
        this.luogo = c.luogo;
        this.opere = (ArrayList<OperaDArte>)c.opere.clone();
    }
    
    /**
     * Costruttore con array vuoto.
     * @param nome Nome della collezione.
     * @param luogo Luogo della collezione.
     */
    public Collezione(String nome, String luogo){
        this.nome = nome;
        this.luogo = luogo;
        this.opere = new ArrayList<>();
    }
    
    /**
     * Aggiunge un oggetto (figlio di) OperaDArte all'ArrayList di opere.
     * @param o l'oggetto da aggiungere all'ArrayList.
     * @return <p>True se inserito correttamente.<br>False se l'oggetto passato è null.</p>
     */
    public boolean addOperaDArte(OperaDArte o){
        if(o == null) return false;
        return opere.add(o);
    }
    
    /**
     * Rimuove l'oggetto (figlio di) <code>OperaDArte o</code>
     * @param o oggetto da rimuovere, viene controllato solo il nome dell'opera.
     * @return l'oggetto rimosso.
     */
    public OperaDArte removeOperaDArte(OperaDArte o){
        return removeOperaDArte(o.titolo); 
    }
    
    /**
     * Rimuove il primo oggetto figlio di <code>OperaDArte</code> trovato tramite il nome.
     * @param nome nome dell'oggetto da rimuovere.
     * @return l'oggetto rimosso.
     */
    public OperaDArte removeOperaDArte(String nome){
        if(nome == null) return null;
        try{
            return opere.remove(posOpera(nome));
        }catch(IndexOutOfBoundsException e){
            return null;
        }
    }
    
    /**
     * Trova e restituisce la posizione nell'ArrayList della prima<br>
     * opera che viene trovata col nome uguale a <code>nome</code>
     * @param nome nome dell'opera da trovare.
     * @return <p>posizione dell'opera trovata.<br>-1 se non viene trovato niente.</p>
     */
    private int posOpera(String nome){
        for(int i = 0; i < opere.size(); i++){
            if(opere.get(i).equals(nome)) return i;
        }
        return -1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public ArrayList<OperaDArte> getOpere() {
        return opere;
    }
    
    /*
    La classe contenente la collezione dovrà esporre i seguenti opportuni metodi che permettano di sapere:
    • il nome dell’artista dell’opera più costosa
    • la quantità di opere di tipo quadro e di opere di tipo scultura presenti nella collezione
    • il valore totale della collezione
    • il valore totale per ogni singola tipologia di opere
    */
    
    /**
     * Cerca nella collezione il nome dell'artista dell'opera più costosa.
     * @return il nome dell'artista dell'opera più costosa.
     */
    public String trovaNomeArtista_OperaPiuCostosa(){
        int max = 0;
        for(int i = 0; i < opere.size(); i++){
            if(opere.get(i).quotazione > opere.get(max).quotazione) max = i;
        }
        return opere.get(max).artista;
    }
    
    /**
     * Conta quanti oggetti figli di <code>OperaDArte</code> di un certo tipo ci sono all'interno dell'ArrayList.
     * <p>Se si vuole il numero di quante opere Quadro ci sono: <code>contaOggetti(Quadro.class)</code><br>
     * Se si vuole il numero di quante opere Scultura ci sono: <code>contaOggetti(Scultura.class)</code></p>
     * @param c la classe del tipo di opere di cui contare il numero.
     * @return il numero di oggetti di una classe figlia di <code>OperaDArte</code>
     */
    public int contaOggetti(Class<? extends OperaDArte> c){
        int j = 0;        
        for(OperaDArte op: opere){
            if(c == op.getClass()) j++;
        }
        return j;
    }
    
    /**
     * Conta quanti oggetti di un certo tipo ci sono ci sono all'interno dell'ArrayList.
     * <p>Per il numero totale delle opere Quadro: <code>contaOggetti(QUADRO)</code><br>
     * Per il numero totale delle opere Scultura: <code>contaOggetti(SCULTURA)</code></p>
     * @param t enum <code>Tipo</code>, il tipo di oggetto da contare.
     * @return il numero di oggetti di una classe figlia di <code>OperaDArte</code>.
     */
    public int contaOggetti(Tipo t){
        int j = 0;
        for(OperaDArte op: opere){
            if(op.getTipo() == t) j++;
        }
        return j;
    }
    
    /**
     * Calcola il valore complessivo di un certo tipo di opera figlia di <code>OperaDArte</code>.
     * <p>Per il valore totale delle opere Quadro: <code>valoreTotPerTipoDiOpera(Quadro.class)</code><br>
     * Per il valore totale delle opere Scultura: <code>valoreTotPerTipoDiOpera(Scultura.class)</code></p>
     * @param c Classe dell'opera da includere.
     * @return La somma complessiva del valore delle opere.
     */
    public double valoreTotPerTipoDiOpera(Class <? extends OperaDArte> c){
        double sum = 0;
        
        for(OperaDArte op: opere){
            if (op.getClass() == c) sum += op.quotazione;
        }
        
        return sum;
    }
    
    /**
     * Calcola il valore complessivo di un certo tipo.
     * <p>Per il valore totale delle opere Quadro: {@code valoreTotPerTipoDiOpera(QUADRO)}<br>
     * Per il valore totale delle opere Scultura: {@code valoreTotPerTipoDiOpera(SCULTURA)}</p>
     * @param t enum <code>Tipo</code> di opera da includere.
     * @return La somma complessiva del valore delle opere.
     */
    public double valoreTotPerTipoDiOpera(Tipo t){
        double sum = 0;
        
        for(OperaDArte op: opere){
            if (op.getTipo() == t) sum += op.quotazione;
        }
        
        return sum;
    }
    
    /**
     * Calcola il valore totale della collezione.
     * @return <p>Il valore totale della collezione.<br>Se vuota ritorna 0.</p>
     */
    public double calcolaValoreTotaleCollezione(){
        double sum = 0;
        
        for(OperaDArte op: opere){
            sum += op.quotazione;
        }
        
        return sum;
    }
    
}