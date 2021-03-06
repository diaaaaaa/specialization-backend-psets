package com.l.pset.pset4;

import com.l.pset.pset4.controller.Airport;
import com.l.pset.pset4.model.Luggage;
import com.l.pset.pset4.parse.LuggageParser;

import java.util.List;

public class Pset4Main {

    public static void main(String[] args) {
        LuggageParser luggageParser = new LuggageParser();
        List<Luggage> departureLuggage = luggageParser.asList("src\\main\\java\\com\\l\\pset\\pset4\\data\\luggage.csv");
        Airport airport = new Airport();
        List<Luggage> arrivalLuggage = airport.travel(departureLuggage);

        // Returning the list of arrival luggage will be very useful
        // when we learn about unit testing to be able to test the behaviour
        // of the Airport class automatically
    }
}
