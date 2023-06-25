package org.example.model;

public class Seat {
    private int seatId;
    private int seatRow;
    private int seatNumber;
    private int ticketPrice;
    private SeatStatus seatStatus;

    // ---------- getters and setters
    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(int seatRow) {
        this.seatRow = seatRow;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    // ---------- constructor

    public Seat() {
    }

    public Seat(int seatId, int seatRow, int seatNumber, int ticketPrice, SeatStatus seatStatus) {
        this.seatId = seatId;
        this.seatRow = seatRow;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
        this.seatStatus = seatStatus;
    }
}
