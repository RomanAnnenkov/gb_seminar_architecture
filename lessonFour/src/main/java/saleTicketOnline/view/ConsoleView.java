package saleTicketOnline.view;

import saleTicketOnline.onlineShop.OnlineShop;

import java.util.Scanner;

/**
 * Консольный интерфейс пользователя
 */
public class ConsoleView implements IView {
    private OnlineShop shop;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleView(OnlineShop shop) {
        this.shop = shop;
    }

    /**
     * Метод для запуска консольной оболочки
     */
    @Override
    public void run() {
        System.out.println("Онлайн покупка билетов.");
    }
}
