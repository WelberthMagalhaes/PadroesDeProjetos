/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author welberth
 */
public class App {
    
    public static void main(String[] args) {
        
        //ConversorTXT conversorASCII = new ConversorASCII();
        ConversorTXT conversorBinario = new ConversorBinario();
        //ConversorTXT conversorHex = new ConversorHex();
        //ConversorTXT conversorOct = new ConversorOCT();
        
        
        //Diretor diretorOCT = new Diretor(conversorOct);
        //Diretor diretorHex = new Diretor(conversorHex);
        Diretor diretorBinario = new Diretor(conversorBinario);
        //Diretor diretorASCII = new Diretor(conversorASCII);
        
        
        //diretorOCT.converter("C:\\Users\\welbe\\Documents\\Git\\PadroesDeProjetos\\texto.txt", "C:\\Users\\welbe\\Documents\\Git\\PadroesDeProjetos\\saida.txt");
        //diretorHex.converter("C:\\Users\\welbe\\Documents\\Git\\PadroesDeProjetos\\texto.txt", "C:\\Users\\welbe\\Documents\\Git\\PadroesDeProjetos\\saida.txt");
        diretorBinario.converter("C:\\Users\\welbe\\Documents\\Git\\PadroesDeProjetos\\texto.txt", "C:\\Users\\welbe\\Documents\\Git\\PadroesDeProjetos\\saida.txt");
        //diretorASCII.converter("C:\\Users\\welbe\\Documents\\Git\\PadroesDeProjetos\\texto.txt", "C:\\Users\\welbe\\Documents\\Git\\PadroesDeProjetos\\saida.txt");
    }
    
}
