package com.l.pset.pset3.model;

public class Lizard implements Movement {

    @Override
    public String getName() {
        return "Lizard";
    }

    @Override
    public boolean wins(Movement move) {
        return isEqualTo(move, "Spock") || isEqualTo(move, "Paper");

    }

    private boolean isEqualTo(Movement move, String name) {
        return move.getName().equalsIgnoreCase(name);
    }


}
