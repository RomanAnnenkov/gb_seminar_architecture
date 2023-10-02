package saleTicketOnline.ticket;

import java.time.LocalDateTime;

public class BusTicket extends Ticket {

    private final int routeId;

    public BusTicket(int ticketNumber, LocalDateTime departureTime, int routeId) {
        super(ticketNumber, departureTime);
        this.routeId = routeId;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public void setSurname(String surname) {
        super.surname = surname;
    }

    @Override
    public void setID(String id) {
        super.id = id;
    }
}
