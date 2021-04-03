package pkgBuilder;

public class FacadeBuilder{
	
	private ConcessionariaDirector concessionaria;


	public void makeFiatCar(){


		concessionaria = new ConcessionariaDirector(new FiatBuilder());
	 
	    concessionaria.construirCarro();
	    
	    CarroProduct carro = concessionaria.getCarro();
	    
	    System.out.println("Carro: " + carro.modelo + "/" + carro.montadora + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
	    					 + carro.dscMotor + "\nValor: " + carro.preco);
	}


	public void makeVolksCar(){
	 
	    concessionaria = new ConcessionariaDirector(new VolksBuilder());
	    
	    concessionaria.construirCarro();
	    
	    carro = concessionaria.getCarro();
	    
	    System.out.println("Carro: " + carro.modelo + "/" + carro.montadora + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
	                       + carro.dscMotor + "\nValor: " + carro.preco);
	}

	public void makeGMCar(){
	 
	    concessionaria = new ConcessionariaDirector(new GMBuilder());
	    
	    concessionaria.construirCarro();
	    
	    carro = concessionaria.getCarro();
	    
	    System.out.println("Carro: " + carro.modelo + "/" + carro.montadora + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
	                       + carro.dscMotor + "\nValor: " + carro.preco);
	}

}