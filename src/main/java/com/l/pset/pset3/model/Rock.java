package com.l.pset.pset3.model;

public class Rock implements Movement {
    @Override
    public String getName() {
        return "Rock";
    }

    @Override
    public boolean wins(Movement move) {
        if (move.getName().equalsIgnoreCase("Scissors") || move.getName().equalsIgnoreCase("Lizard"))
        return true;
        return false;
    }

}
