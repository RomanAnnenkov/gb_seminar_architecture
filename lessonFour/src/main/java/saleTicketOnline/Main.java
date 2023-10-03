package saleTicketOnline;

import saleTicketOnline.onlineShop.OnlineShop;
import saleTicketOnline.ticketProvider.BusTicketProvider;
import saleTicketOnline.view.ConsoleView;
import saleTicketOnline.view.IView;

public class Main {
    public static void main(String[] args) {
        BusTicketProvider busTicketProvider = new BusTicketProvider();
        OnlineShop shop = new OnlineShop(busTicketProvider);
        IView view = new ConsoleView(shop);
        view.run();

    }
}
