
package Estrategias;

/**
 *
 * @author welbe
 */
public class EstrategiaClasseEconomica implements EstrategiaDePontuacao{

    @Override
    public int calcularPontuacao(int distanciaDeVoo) {
        return distanciaDeVoo/4;
    }
    
}
