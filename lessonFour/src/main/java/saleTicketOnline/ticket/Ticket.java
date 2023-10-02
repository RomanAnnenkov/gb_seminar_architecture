package saleTicketOnline.ticket;

import java.time.LocalDateTime;

public abstract class Ticket implements TicketActions {
    public Ticket(int ticketNumber, LocalDateTime departureTime) {
        this.ticketNumber = ticketNumber;
        this.departureTime = departureTime;
    }

    protected int ticketNumber;
    protected String name;
    protected String surname;
    protected String id;
    protected LocalDateTime departureTime;



}
