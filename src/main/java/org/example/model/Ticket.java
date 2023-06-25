package org.example.model;

public class Ticket {
    private int ticketId;
    private Showtime showtime;
    private Seat seat;
    private int price;
    private PaymentStatus paymentStatus;

    // ---------- getters and setters
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    // ---------- constructor

    public Ticket() {
    }

    public Ticket(int ticketId, Showtime showtime, Seat seat, int price, PaymentStatus paymentStatus) {
        this.ticketId = ticketId;
        this.showtime = showtime;
        this.seat = seat;
        this.price = price;
        this.paymentStatus = paymentStatus;
    }
}
