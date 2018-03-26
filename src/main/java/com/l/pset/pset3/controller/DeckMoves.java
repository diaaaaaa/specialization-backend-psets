package com.l.pset.pset3.controller;



import com.l.pset.pset3.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeckMoves {
    private List<Movement> movements;

    public DeckMoves() {
        movements = Stream.of(
                new Paper(),
                new Rock(),
                new Scissors(),
                new Lizard(),
                new Spock()
        ).collect(Collectors.toList());
    }

    public List<Movement> getMoves() {
        return new ArrayList<>(movements);
    }
}
