package saleTicketOnline.ticketProvider;

import saleTicketOnline.ticket.Ticket;

import java.time.LocalDateTime;
import java.util.List;

public interface TicketProviderActions {
    List<Ticket> getAvailableTickets(LocalDateTime depTime, int route);
    boolean reserveTicket(Ticket ticket);
    boolean canselTicket(Ticket ticket);

}
