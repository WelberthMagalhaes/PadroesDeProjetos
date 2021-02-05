/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote1;


/**
 *
 * @author welbe
 */
public class Bilhete {
    
    protected String classe;
        

    public EstrategiaDePontuacao getEstrategiaDePontuacao(boolean isPassageiroDiamante){
        
        if (isPrimeiraClasse() && isPassageiroDiamante) {
            
            return new EstrategiaPrimeiraClasseDiamante();
        
        } else if (isPrimeiraClasse()) {
            
            return new EstrategiaPrimeiraClasse();
        
        } else if (isClasseEconomica()) {
        
            return new EstrategiaClasseEconomica();
        
        } else {
            return new EstrategiaPromocional();
        }
    }

    
    public  boolean isPrimeiraClasse() {
        
        if (this.classe.equals("Primeira")) return true;
        
        return false;
    }
    
    public boolean isClasseEconomica() {
        
        if (this.classe.equals("Econômica")) return true;
        
        return false;
    }
    
    public boolean EstrategiaPromocional() {
        
        if (this.classe.equals("Promocional")) return true;
        
        return false;
    }
    
    
    
    public Bilhete(String  classe) {
        
        this.classe = classe;
    }
    
}
