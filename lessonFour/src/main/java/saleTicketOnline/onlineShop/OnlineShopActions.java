package saleTicketOnline.onlineShop;


import saleTicketOnline.ticketProvider.TicketProviderActions;
import saleTicketOnline.user.User;

/**
 * интерфейс магазина продажи билетов
 */
public interface OnlineShopActions extends TicketProviderActions {
    /**
     * Метод для создания пользователя
     *
     * @param email строка с адресом электронной почты
     * @param name  строка с именем пользователя
     * @return возвращает созданного пользователя
     */
    User createUser(String email, String name);

    /**
     * Метод для проверки денежных средств на балансе пользователя
     *
     * @return возвращает true если баланс больше или равен стоимости билета, иначе false
     */
    boolean checkFunds();

    /**
     * метод для подтверждения покупки, получаем согласие пользователя
     * на списание средств и выписку билета
     *
     * @return возвращает true в случае если пользовател согласен, иначе false
     */
    boolean confirmPurchase();

    /**
     * метод для списание средств с баланса пользователя
     *
     * @return возвращает true в случае успешного списания, иначе false
     * @pre пользователь должен дать согласие на списание
     */
    boolean deductFunds();

    /**
     * Метод для авторизации пользователя
     *
     * @param username строка  именем пользователя
     * @param password строка с паролем пользователя
     * @return возвращает true в случае успешной авторизации, иначе false
     */
    boolean authorize(String username, String password);

}
