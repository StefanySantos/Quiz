package Regras;

import java.util.ArrayList;

public class ExecutaProblemas {

    private ArrayList<ProblemaNumerico> problemas;
    private int posicaoAtual;
    private int score;

    public ExecutaProblemas() {

        problemas = new ArrayList<ProblemaNumerico>();

        problemas.add(new ProblemaNumerico(new int[]{3, 1, 4, 1, 5}, 9));
        problemas.add(new ProblemaNumerico(new int[]{2, 3, 5, 8, 13}, 21));
        problemas.add(new ProblemaNumerico(new int[]{1, 2, 4, 8, 16}, 32));
        problemas.add(new ProblemaNumerico(new int[]{1, 4, 9, 16, 25}, 36));
        problemas.add(new ProblemaNumerico(new int[]{1, 2, 3, 7, 11}, 13));

        score = 0;
        posicaoAtual = 0;

    }

    public ArrayList<ProblemaNumerico> getProblemas() {
        return problemas;
    }

    public void setProblemas(ArrayList<ProblemaNumerico> problemas) {
        this.problemas = problemas;
    }

    public int getPosicaoAtual() {
        return posicaoAtual;
    }

    public void setPosicaoAtual(int posicaoAtual) {
        this.posicaoAtual = posicaoAtual;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setProximo() {
        posicaoAtual++;
        if (posicaoAtual > problemas.size()) {
            posicaoAtual = 0;
        }
    }

    public ProblemaNumerico getProblemaNumerico() {
        return problemas.get(posicaoAtual);
    }

    public void verificarJogada(int solucao) {
        if (problemas.get(posicaoAtual).getSolucao() == solucao) {
            score++;

        }
        setProximo();

    }

}

/* public int somaScore(){
        
        if(posicaoAtual==problemas.size()){
            total=score;
        }
         return total;   
    } */
// public void somaScore(){
//   if(posicaoAtualproblemas.)
//var:='1'
//var:=var+var
//      var=+var

