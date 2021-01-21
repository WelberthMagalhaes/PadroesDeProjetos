public class SementeMilho extends Semente{

    
    public SementeMilho (){
        tipo = "Milho";
        preco = 50.00;
    }

    @Override
    public void exibeSemente() {
        System.out.println("Pedido de " + tipo);
    }

    

    



}