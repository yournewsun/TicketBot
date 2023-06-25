package org.example.model;

public class Hall {
    private int HallId;
    private String hallName;
    private int hallRow;
    private int hallNumberSeat;

    // ---------- getters and setters
    public int getHallId() {
        return HallId;
    }

    public void setHallId(int hallId) {
        HallId = hallId;
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
}
