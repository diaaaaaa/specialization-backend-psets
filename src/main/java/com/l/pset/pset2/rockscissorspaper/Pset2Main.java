package com.l.pset.pset2.rockscissorspaper;


import com.l.pset.pset2.rockscissorspaper.controller.RockPaperScissors;

import java.util.Scanner;

public class Pset2Main {
    public static void main(String[] args) {
        System.out.println("Host - Welcome to the Rock, Scissors, Paper\n");
        Scanner scanner = new Scanner(System.in);

        String choice;
        do {
            new RockPaperScissors().play();
            System.out.print("Do you want to play again? (y/n): ");
            choice = scanner.next();

        }while (choice.equalsIgnoreCase("y"));

        System.out.println("\nHost - Goodbye!");

    }
}
