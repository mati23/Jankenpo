package org.model;

import java.util.HashMap;
import java.util.Map;

public class Score {
    public enum Placar{
        VITORIA,DERROTA,EMPATE;
    }
    public Placar placar;
    public Map<Enum, Integer>  resultado;
    public Score(){
        this.resultado = new HashMap<Enum, Integer>();
        resultado.put(placar.VITORIA,0);
        resultado.put(placar.DERROTA,0);
        resultado.put(placar.EMPATE,0);
    }
    public void incrementResult(Enum field){
        resultado.put(field,resultado.get(field)+1);
    }
    public String getResult(Enum field){
        return resultado.get(field).toString();
    }

}
