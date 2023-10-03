package saleTicketOnline.onlineShop;


import saleTicketOnline.ticketProvider.TicketProviderActions;
import saleTicketOnline.user.User;

public interface OnlineShopActions extends TicketProviderActions {
    User createUser(String email, String name);

    boolean checkFunds();
    boolean confirmPurchase();
    boolean deductFunds();
    boolean authorize(String username, String password);

}
