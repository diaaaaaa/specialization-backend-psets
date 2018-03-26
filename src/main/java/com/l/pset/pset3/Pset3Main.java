package com.l.pset.pset3;

import com.l.pset.pset3.controller.RockPaperScissors;

import java.util.Scanner;

public class Pset3Main {

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
