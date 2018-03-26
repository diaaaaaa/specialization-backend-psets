package com.l.pset.pset1.model;

import com.l.pset.pset1.controller.MovieDatabaseSummarizer;
import com.l.pset.pset1.parser.ActorParser;
import com.l.pset.pset1.parser.MovieParser;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SummaryTest {

    MovieParser movieParser = new MovieParser();
    ActorParser actorParser = new ActorParser();
    MovieDatabaseSummarizer movieDatabaseSummarizer = new MovieDatabaseSummarizer();
    Summary summaryMovie = movieDatabaseSummarizer.summarizeMovie(movieParser.getMovies());
    Summary summaryActor = movieDatabaseSummarizer.summarizeActor(actorParser.getActors());

    @Test
    public void getTopRatedMovies() {

        assertEquals(Arrays.asList("Reckless (10.0)", "Girl in the Cadillac (10.0)", "The Haunted World of Edward D. Wood, Jr. (10.0)", "Carmen Miranda: Bananas Is My Business (10.0)", "Other Voices Other Rooms (10.0)"), summaryMovie.getTopRatedMovies());

    }

    @Test
    public void getTopMoviesGeners() {

        assertEquals(Arrays.asList("Drama (14495)", "Comedy (8955)"), summaryMovie.getTopMoviesGeners() );

    }

    @Test
    public void getTopMostHiredActors() {

        assertEquals(Arrays.asList("Bess Flowers (82)", "Christopher Lee (69)", "Grey Griffin (58)", "Danny Trejo (54)", "Eric Roberts (52)"), summaryActor.getTopMostHiredActors() );
    }

    @Test
    public void getNumberActorsMaleFemaleRatio() {

        assertEquals(Arrays.asList( "Male (196.89593141194933)", "Female (377.624679450377)"), summaryActor.getNumberActorsMaleFemaleRatio() );

    }
}