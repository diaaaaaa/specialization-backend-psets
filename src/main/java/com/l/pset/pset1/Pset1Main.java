package com.l.pset.pset1;

import com.l.pset.pset1.controller.MovieDatabaseSummarizer;
import com.l.pset.pset1.model.Actor;
import com.l.pset.pset1.model.Movie;
import com.l.pset.pset1.model.Summary;
import com.l.pset.pset1.parser.ActorParser;
import com.l.pset.pset1.parser.MovieParser;
import com.l.pset.pset1.view.SummaryDisplayer;

import java.util.List;


public class Pset1Main {

    public static void main(String[] args) {
        MovieParser parserMovie = new MovieParser();
        ActorParser parserActor = new ActorParser();

        List<Movie> movies = parserMovie.getMovies();
        List<Actor> actors = parserActor.getActors();

        MovieDatabaseSummarizer summarizerMovie = new MovieDatabaseSummarizer();
        MovieDatabaseSummarizer summarizerActor = new MovieDatabaseSummarizer();

        SummaryDisplayer displayerMovie = new SummaryDisplayer();
        SummaryDisplayer displayerActor = new SummaryDisplayer();

        Summary summaryMovie = summarizerMovie.summarizeMovie(movies);
        Summary summaryActor = summarizerActor.summarizeActor(actors);
        displayerMovie.displayMovie(summaryMovie);
        displayerActor.displayActor(summaryActor);


    }
}
