package com.l.pset.pset2.rockscissorspaper.controller;

import com.l.pset.pset2.rockscissorspaper.model.Movement;


import java.util.Scanner;
import java.util.stream.Collectors;

public class HumanPlayer implements Player {

    @Override
    public Movement showMove(DeckMoves deckMoves) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your move ");
        show(deckMoves);
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();
        return toMonement(choice, deckMoves);
    }

    private void show(DeckMoves deckMoves) {
        String movements = deckMoves.getMoves().stream()
                .map(card -> card.getName())
                .collect(Collectors.joining(", "));
        System.out.println(movements);
    }
    private Movement toMonement(String choice, DeckMoves deck) {
        return deck.getMoves().stream()
                .filter(card -> card.getName().equalsIgnoreCase(choice))
                .findFirst().get();
    }
}
