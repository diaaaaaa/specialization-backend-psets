package com.l.pset.pset2.rockscissorspaper.view;


import com.l.pset.pset2.rockscissorspaper.model.Movement;

public class DisplayResults {
    public void sayResult(Movement move1, Movement move2) {


        System.out.println("The result of this round is.... !");
        System.out.println("Player 1 move: " + move1.getName());
        System.out.println("Player 2 move: " + move2.getName());

        if (move1.getName().equalsIgnoreCase(move2.getName())) {
            System.out.println("Nobody wins.");
        } else if (move1.getName().equalsIgnoreCase("Scissors") && move2.getName().equalsIgnoreCase("Paper")) {
            System.out.println("Player 1 wins.");
        } else if (move1.getName().equalsIgnoreCase("Rock") && move2.getName().equalsIgnoreCase("Scissors")) {
            System.out.println("Player 1 wins.");
        } else if (move1.getName().equalsIgnoreCase("Paper") && move2.getName().equalsIgnoreCase("Rock")) {
            System.out.println("Player 1 wins.");
        } else
            System.out.println("Player 2 (you) wins.");


    }
}
