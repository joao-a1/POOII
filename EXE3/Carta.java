package cartanaipe;

public class Carta {
    private int value;
    private String naipe;
    
    public Carta(int value, String naipe) throws Exception {
        setValue(value);
        setNaipe(naipe);
    } 
    
    public void setValue(int val) throws Exception {
        if(val < 1) {
            throw new Exception("Número não pode ser menor que 1!");
        }
        if(val > 13) {
            throw new Exception("Número não pode ser maior que 13!");
        }
        this.value = val;
    }
    
    public void setNaipe(String naipe) throws Exception {
        if(naipe.equalsIgnoreCase("copas") || naipe.equalsIgnoreCase("espadas") 
                || naipe.equalsIgnoreCase("ouros") || naipe.equalsIgnoreCase("paus")) {
            this.naipe = naipe;
        } else {
            throw new Exception("Naipe inválido!");
        }
    }
    
    public int getValue() {
        return this.value;
    }
    
    public String getNaipe() {
        return this.naipe;
    }
    
    public void showCartas() {
        System.out.println("--------------------------------");
        if(this.getValue() > 1 && this.getValue() < 11) {
            System.out.println("Valor da carta: " + this.getValue());
        } else if(this.getValue() == 1) System.out.println("Valor da carta: " + "Ás");
        else if(this.getValue() == 11) System.out.println("Valor da carta: " + "J");
        else if(this.getValue() == 12) System.out.println("Valor da carta: " + "Q");
        else if(this.getValue() == 13) System.out.println("Valor da carta: " + "K");
        System.out.println("Naipe: " + this.getNaipe() + "\n");
    }
    
}
