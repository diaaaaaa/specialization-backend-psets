package com.l.pset.pset4.controller.travelstage;

import com.l.pset.pset4.model.Luggage;

import java.time.Duration;

public class TransportCart implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TODO add 25 minutes to the processing time
        Duration waitingDuration = luggage.getWaitingDuration();
        Duration updatedDuration = waitingDuration.plusMinutes(25);
        luggage.setWaitingDuration(updatedDuration);
        return luggage;
    }
}
