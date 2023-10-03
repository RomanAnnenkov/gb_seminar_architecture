package saleTicketOnline.onlineShop;

import saleTicketOnline.ticket.Ticket;
import saleTicketOnline.ticketProvider.TicketProviderActions;
import saleTicketOnline.user.User;

import java.time.LocalDateTime;
import java.util.List;

public class OnlineShop implements OnlineShopActions {

    TicketProviderActions ticketProvider;

    public OnlineShop(TicketProviderActions ticketProvider) {
        this.ticketProvider = ticketProvider;
    }

    @Override
    public User createUser(String email, String name) {
        return null;
    }

    @Override
    public boolean checkFunds() {
        return false;
    }

    @Override
    public boolean confirmPurchase() {
        return false;
    }

    @Override
    public boolean deductFunds() {
        return false;
    }

    @Override
    public boolean authorize(String username, String password) {
        return false;
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
