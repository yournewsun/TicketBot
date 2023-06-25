package org.example.model;

public class Hall {
    private int hallId;
    private String hallName;
    private int hallRow;
    private int hallNumberSeat;

    // ---------- getters and setters
    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public int getHallRow() {
        return hallRow;
    }

    public void setHallRow(int hallRow) {
        this.hallRow = hallRow;
    }

    public int getHallNumberSeat() {
        return hallNumberSeat;
    }

    public void setHallNumberSeat(int hallNumberSeat) {
        this.hallNumberSeat = hallNumberSeat;
    }

    // ---------- constructor
    public Hall(){}

    public Hall(int hallId, String hallName, int hallRow, int hallNumberSeat){
        this.hallId = hallId;
        this.hallName = hallName;
        this.hallRow = hallRow;
        this.hallNumberSeat = hallNumberSeat;
    }
}
