
public abstract class DecoratorImpressora implements ImpressorasInterface{

    protected ImpressorasInterface impressora;

    public DecoratorImpressora(ImpressorasInterface impressora){
        this.impressora = impressora;
    }
    
    @Override
    public Double getPreco() {
        // TODO Auto-generated method stub
        return impressora.getPreco();
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return impressora.getTipo();
    }
}
