package org.model;

public enum Janken {
    PEDRA,PAPEL,TESOURA;

    private Janken janken = null;

    public static Janken setRandom(){
        return values()[(int) (Math.random()*values().length)];
    }

    public String resolveMatch(Janken player2){
        String result = "";
        if(this == PEDRA){
           result =  player2 == TESOURA ? ("VITORIA") : (player2 == PEDRA ? "EMPATE": "DERROTA");
        }
        else if(this == PAPEL){
            result =  player2 == PEDRA ? ("VITORIA") : (player2 == PAPEL ? "EMPATE": "DERROTA");
        }
        else{
            result =  player2 == PAPEL ? ("VITORIA") : (player2 ==TESOURA ? "EMPATE": "DERROTA");
        }
        return result;
    }

}
