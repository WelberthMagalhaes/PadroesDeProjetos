package prova;

public class Diretor {

	ConversorTXT conversor;

	public Diretor(ConversorTXT conversor){

		this.conversor = conversor;
	}


	public void converter(String local, String destino){

		//Altere os caminhos e os contrutores
		conversor.converte(local, destino);
		//conversor.converte("C:\\Users\\Philipe\\Desktop\\TESTE.txt","C:\\Users\\Philipe\\Desktop\\saida.txt");

	}	
		
}
