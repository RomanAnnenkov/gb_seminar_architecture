package saleTicketOnline.ticketProvider;

import saleTicketOnline.ticket.BusTicket;
import saleTicketOnline.ticket.Ticket;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BusTicketProvider implements TicketProviderActions {

    private final List<BusTicket> busTickets = new ArrayList<>();;

    public BusTicketProvider() {
        busTickets.add(new BusTicket(1001, LocalDateTime.now(), 104));
    }

    @Override
    public List<Ticket> getAvailableTickets(LocalDateTime depTime, int route) {
        return null;
    }

    @Override
    public boolean reserveTicket(Ticket ticket) {
        return false;
    }

    @Override
    public boolean canselTicket(Ticket ticket) {
        return false;
    }
}
