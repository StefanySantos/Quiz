
package Regras;

public class ProblemaNumerico {
    
    private int [] numeros;
    private int solucao;

    public ProblemaNumerico(int[] numeros, int solucao) {
        this.numeros = numeros;
        this.solucao = solucao;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int getSolucao() {
        return solucao;
    }

    public void setSolucao(int solucao) {
        this.solucao = solucao;
    }
    
    
    
    
}
