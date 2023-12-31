package org.example.model;

import java.util.ArrayList;
import java.util.Date;

public class Showtime {
    private int showtimeId;
    private Movie movie;
    private Date startTime;
    private ArrayList<Seat> availableSeats;

    // ---------- getters and setters
    public int getShowtimeId() {
        return showtimeId;
    }

    public void setShowtimeId(int showtimeId) {
        this.showtimeId = showtimeId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public ArrayList<Seat> getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(ArrayList<Seat> availableSeats) {
        this.availableSeats = availableSeats;
    }

    // ---------- constructor

    public Showtime() {
    }

    public Showtime(int showtimeId, Movie movie, Date startTime, ArrayList<Seat> availableSeats) {
        this.showtimeId = showtimeId;
        this.movie = movie;
        this.startTime = startTime;
        this.availableSeats = availableSeats;
    }
}
