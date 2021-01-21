public class FabricaSemente {

    public Semente criaSemente( String tipo){
        Semente semente = null;

        if (tipo.equals("Milho")) {
            semente = new SementeMilho();}
        else if(tipo.equals("Soja")){
            semente = new SementeSoja();}


        return semente;
    };

}