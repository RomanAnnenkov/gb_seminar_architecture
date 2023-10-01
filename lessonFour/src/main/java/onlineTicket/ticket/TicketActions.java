package onlineTicket.ticket;

interface TicketActions {
    boolean reserveTicket();
    boolean deductFunds();
    boolean confirmPurchase();
    void updateTicketAvailability();
    boolean cancelReservation();
}
