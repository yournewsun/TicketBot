package org.example.model;

import java.util.ArrayList;

public class Cinema {
    private int cinemaId;
    private String cinemaName;
    private String cinemaAddress;
    private ArrayList<Movie> movieList;
    private ArrayList<Hall> hallList;

    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaAddress() {
        return cinemaAddress;
    }

    public void setCinemaAddress(String cinemaAddress) {
        this.cinemaAddress = cinemaAddress;
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(ArrayList<Movie> movieList) {
        this.movieList = movieList;
    }

    public ArrayList<Hall> getHallList() {
        return hallList;
    }

    public void setHallList(ArrayList<Hall> hallList) {
        this.hallList = hallList;
    }
}
