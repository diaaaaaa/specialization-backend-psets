package com.l.pset.pset3.model;

public class Spock implements Movement {

    @Override
    public String getName() {
        return "Spock";
    }

    @Override
    public boolean wins(Movement move) {
        if (move.getName().equalsIgnoreCase("Scissors") || move.getName().equalsIgnoreCase("Rock"))
            return true;
        return false;
    }


}
