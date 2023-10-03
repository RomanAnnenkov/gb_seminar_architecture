package saleTicketOnline.ticket;

import java.time.LocalDateTime;

public abstract class Ticket implements TicketActions {
    protected int ticketNumber;
    protected String name;
    protected String surname;
    protected String id;
    protected LocalDateTime departureTime;

    public Ticket(int ticketNumber, LocalDateTime departureTime) {
        this.ticketNumber = ticketNumber;
        this.departureTime = departureTime;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }





}
