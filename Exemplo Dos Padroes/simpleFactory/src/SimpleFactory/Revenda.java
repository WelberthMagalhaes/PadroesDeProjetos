public class Revenda {
    
    FabricaSemente fabrica;

    public Revenda(FabricaSemente fabrica){
        this.fabrica = fabrica;
    }

    public Semente pedirSemente(String tipo){
        Semente semente;
        semente = fabrica.criaSemente(tipo);

        return semente;
    }


}
