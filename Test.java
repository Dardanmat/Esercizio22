package esercizi.esercizio22;

public class Test {
    public static void main(String[] args) {
        
        Collezione colle = new Collezione("Gianni Totti", "Oslo");
        
        colle.addOperaDArte(new Scultura(5, 3, 5, "Parallelepipedo 5x3x5", "Giovanni", 1000.52, "L'opera è ispirata ad un cubo, ma basso"));
        colle.addOperaDArte(new Scultura(4, (float)3.5, 6, "Scultura n.2", "Francesco Totti", 4999.99, "Dentro la cosa lì c'è una palla"));
        colle.addOperaDArte(new Scultura(3, 13, 9, "Razzo", "Elon Musk", 10.32, "MArte."));
        colle.addOperaDArte(new Scultura(2, (float)1.5, 8, ":..:.:::", "Girolamo il Cieco", 30000.01, ".:::.:...::.:..::::...::.:."));
        colle.addOperaDArte(new Scultura(1, (float)1.2, 7, "Cuadrato C", "Giovanni", 30.33, "Giovanni ancora oggi si chiede perché questa è valutata meno del suo parallelepipedo 5x3x5"));

        colle.addOperaDArte(new Quadro((float)0.8, (float)0.5, "La Re", "Il donna", 26.95, "Costa come Minecraft"));
        colle.addOperaDArte(new Quadro((float)4, (float)2, "Il dipinto di Giovanni", "Giovanni", 100.98, "Giovanni voleva provare la pittura, non è il suo forte"));
        colle.addOperaDArte(new Quadro((float)0.4, (float)0.3, "Colline", "Windows xp", 0.99, "Uno dei panorami più famosi"));
        colle.addOperaDArte(new Quadro((float)1.8, (float)0.7, "Mouse", "Mark", 95.33, "E' un topo o un mouse?"));
        
//        System.out.println("Valore totale della collezione: "+colle.calcolaValoreTotaleCollezione() + "€");
//        System.out.println("Valore di tutti i quadri: "+colle.valoreTotPerTipoDiOpera(Tipo.QUADRO) + "€");
//        System.out.println("Valore di tutti i quadri: "+colle.valoreTotPerTipoDiOpera(Quadro.class) + "€");
//        System.out.println("Valore di tutte le sculture: "+colle.valoreTotPerTipoDiOpera(Tipo.SCULTURA) + "€");
//        System.out.println("Valore di tutte le sculture: "+colle.valoreTotPerTipoDiOpera(Scultura.class) + "€");
//        System.out.println("Numero di sculture: "+colle.contaOggetti(Tipo.QUADRO));
//        System.out.println("Numero di sculture: "+colle.contaOggetti(Quadro.class));
//        System.out.println("Numero di quadri: "+colle.contaOggetti(Tipo.SCULTURA));
//        System.out.println("Numero di quadri: "+colle.contaOggetti(Scultura.class));
        
        System.out.println("Artisto con l'opera più costosa: " + colle.trovaNomeArtista_OperaPiuCostosa());
    
//        for(OperaDArte op: colle.getOpere()){
//            System.out.println("Nome opera: " + op.artista + "\nQuotazione: " + op.quotazione +"\n");
//        }
        
//        System.out.println("Ingombro statua: " + op1.calcolaIngombro() + " m^3"); //funziona
//        System.out.println("Superficie della base della statua: " + op1.calcoloSuperficie() + " m^2"); //funziona
        
    }
}
