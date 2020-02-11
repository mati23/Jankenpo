package org.logique;

import org.model.Janken;
import org.model.Score;

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
        Score resultado = new Score();

        for(int i=0;i<100;i++ ){
            player2 = Janken.setRandom();
            switch (player1.resolveMatch(player2)){
                case("VITORIA"):
                    resultado.incrementResult(Score.Placar.VITORIA);
                    System.out.println("Vitoria");
                    break;
                case ("DERROTA"):
                    resultado.incrementResult(Score.Placar.DERROTA);
                    System.out.println("Derrota");
                    break;
                case ("EMPATE"):
                    resultado.incrementResult(Score.Placar.EMPATE);
                    System.out.println("Empate");
                    break;
            }
        }
        System.out.println("O Jogador 1, que sempre jogou PAPEL, ganhou "
                + resultado.getResult(Score.Placar.VITORIA)+", perdeu " + resultado.getResult(Score.Placar.DERROTA)+ " e empatou " + resultado.getResult(Score.Placar.EMPATE) + " rodadas.");

    }
}
