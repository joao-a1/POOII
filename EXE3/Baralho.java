package cartanaipe;

public class Baralho {
    private static int instancia = 1;
    private int numCartas = 0;
    private Carta[] cartas = new Carta[52];
    
    public void incluirCartasAoBaralho(Carta c) throws Exception {
        if(this.numCartas >= this.cartas.length) {
            throw new Exception("Já foi informado o número máximo de cartas no baralho!");
        }
        int cont = 0;
        for(int i = this.numCartas; i < this.cartas.length; i++) {
            this.cartas[i] = c;
        }
        this.numCartas++;
    }
    
    public void showBaralho() throws Exception {
        System.out.println("\nCartas no Baralho " + instancia + " -----------------------------\n");
        int soma = 0;
        int contE = 0, contO = 0, contP = 0, contC = 0;
            for(int i = 0; i < this.numCartas; i++) {
                soma = i+1;
                
                if(this.cartas[i].getNaipe().equals("espadas")) contE++;
                if(this.cartas[i].getNaipe().equals("ouros")) contO++;
                if(this.cartas[i].getNaipe().equals("paus")) contP++;
                if(this.cartas[i].getNaipe().equals("copas")) contC++;
                if(contE > 13 || contO > 13 || contP > 13 || contC > 13) {
                    throw new Exception("Quantia máxima do mesmo Naipe no baralho deve ser 13!");
                }
                
                if(cartas[i].getValue() > 1 && cartas[i].getValue() < 11) {
                    System.out.println("Valor da carta " + soma + ": " + cartas[i].getValue());
                } else if(cartas[i].getValue() == 1) System.out.println("Valor da carta " + soma + ": " + "Ás");
                else if(cartas[i].getValue() == 11) System.out.println("Valor da carta " + soma + ": " + "J");
                else if(cartas[i].getValue() == 12) System.out.println("Valor da carta " + soma + ": " + "Q");
                else if(cartas[i].getValue() == 13) System.out.println("Valor da carta " + soma + ": " + "K");
                System.out.println("Naipe: " + cartas[i].getNaipe() + 
                        "\n-----------------------------------------------");
            }
            System.out.println("Número de cartas: " + this.numCartas + "\n");
        instancia++;
    }
    
}
