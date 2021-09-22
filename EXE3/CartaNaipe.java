package cartanaipe;

public class CartaNaipe {

    public static void main(String[] args) throws Exception {
        //Instanciando uma carta individual
        Carta c1 = new Carta(2, "espadas");
        Carta c2 = new Carta(1, "copas");
        Carta c3 = new Carta(3, "paus");
        Carta c4 = new Carta(11, "espadas");
        Carta c5 = new Carta(13, "ouros");
        Carta c6 = new Carta(7, "copas");
        
        c1.showCartas();
        
        //Instanciando Classe Baralho
        try {
            Baralho b1 = new Baralho();
            Baralho b2 = new Baralho();
            b1.incluirCartasAoBaralho(c1);
            b1.incluirCartasAoBaralho(c2);
            b1.incluirCartasAoBaralho(c3);
            b1.incluirCartasAoBaralho(c4);
            b2.incluirCartasAoBaralho(c5);
            b2.incluirCartasAoBaralho(c6);
            b1.showBaralho();
            b2.showBaralho();
            } catch(Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
    }
    
}
