package com.l.pset.pset3.view;


import com.l.pset.pset3.model.Movement;

public class Jury {
    public String sayResult(Movement move1, Movement move2) {


        System.out.println("The result of this round is.... !");
        System.out.println("Player 1 move: " + move1.getName());
        System.out.println("Player 2 move: " + move2.getName());

        if (move1.wins(move2)) {
            System.out.println("Player 1 wins");
            return "Player 1 wins";
        }
        else if (move2.wins(move1)) {
            System.out.println("Player 2 wins");
            return "Player 2 wins";
        }
        else
            System.out.println("Nobody wins");
        return "Nobody wins";

    }
}
