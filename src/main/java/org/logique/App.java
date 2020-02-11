package org.logique;

import org.model.Janken;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{




    public static void main( String[] args )
    {
        Janken player1 = Janken.PAPEL;
        Janken player2 = Janken.setRandom();
        Map<String,Integer> placar = new HashMap<String, Integer>();

        placar.put("Vitoria",0);
        placar.put("Derrota",0);
        placar.put("Empate",0);

        System.out.println(player1 + " , " + player2);

        System.out.println(player1.resolveMatch(player2));
        for(int i=0;i<100;i++ ){
            player2 = Janken.setRandom();
            switch (player1.resolveMatch(player2)){
                case("VITORIA"):
                    placar.put("Vitoria",placar.get("Vitoria")+1);
                    System.out.println("Vitoria");
                    break;
                case ("DERROTA"):
                    placar.put("Derrota",placar.get("Derrota")+1);
                    System.out.println("Derrota");
                    break;
                case ("EMPATE"):
                    placar.put("Empate",placar.get("Empate")+1);
                    System.out.println("Empate");
                    break;
            }
        }
        System.out.println("Player 1: " + placar);
    }
}