package com.l.pset.pset3.model;

public class Paper implements Movement {
    @Override
    public String getName() {
        return "Paper";
    }
    @Override
    public boolean wins(Movement move) {
        if (move.getName().equalsIgnoreCase("Rock") || move.getName().equalsIgnoreCase("Spock"))
            return true;
        return false;
    }
}
