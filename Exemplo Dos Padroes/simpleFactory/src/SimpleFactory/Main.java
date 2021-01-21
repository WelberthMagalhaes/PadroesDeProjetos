
public class Main {
    
    public static void main(String[] args) {
        
        FabricaSemente fabrica = new FabricaSemente();
        Revenda revenda = new Revenda(fabrica);
        Semente semente = null;
        Semente semente2 = null;

        
        semente = revenda.pedirSemente("Milho");
        semente2 = revenda.pedirSemente("Soja");
        


        semente.exibeSemente();
        semente2.exibeSemente();
    }
}
