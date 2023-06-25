package org.example.model;

import java.util.ArrayList;

public class Movie {
    private int movieId;
    private String movieTitle;
    private int movieDuration;
    private String movieGenre;
    private String movieDirector;
    private ArrayList <Showtime> showtimeList;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public ArrayList<Showtime> getShowtimeList() {
        return showtimeList;
    }

    public void setShowtimeList(ArrayList<Showtime> showtimeList) {
        this.showtimeList = showtimeList;
    }
}
