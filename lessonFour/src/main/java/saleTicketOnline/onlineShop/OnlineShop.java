package saleTicketOnline.onlineShop;

import saleTicketOnline.ticket.Ticket;
import saleTicketOnline.ticketProvider.TicketProviderActions;
import saleTicketOnline.user.User;

import java.time.LocalDateTime;
import java.util.List;

/**
 * класс магазина по продаже билетов
 */
public class OnlineShop implements OnlineShopActions {

    TicketProviderActions ticketProvider;

    public OnlineShop(TicketProviderActions ticketProvider) {
        this.ticketProvider = ticketProvider;
    }

    /**
     * Метод создания пользователя, в случае если это новый пользователь
     *
     * @param email строка с адресом электронной почты
     * @param name  строка с именем пользователя
     * @return возвращает нового пользователя
     */
    @Override
    public User createUser(String email, String name) {
        return null;
    }

    /**
     * Метод для проверки денежных средств на балансе пользователя
     *
     * @return возвращает true если баланс больше или равен стоимости билета, иначе false
     */
    @Override
    public boolean checkFunds() {
        return false;
    }

    /**
     * метод для подтверждения покупки, получаем согласие пользователя
     * на списание средств и выписку билета
     * @pre билет должен быть оформлен
     * @post запуск выписки билета
     * @return возвращает true в случае если пользовател согласен, иначе false
     */
    @Override
    public boolean confirmPurchase() {
        return false;
    }

    /**
     * метод для списание средств с баланса пользователя
     *
     * @pre пользователь должен дать согласие на списание
     * @post уменьшение баланса пользователя
     *
     * @return возвращает true в случае успешного списания, иначе false
     * */
    @Override
    public boolean deductFunds() {
        return false;
    }

    /**
     * Метод для авторизации пользователя
     *
     * @post пользователь получает флаг авторизован, и может участвовать в оформлении билета
     *
     * @param username строка  именем пользователя
     * @param password строка с паролем пользователя
     * @return возвращает true в случае успешной авторизации, иначе false
     */
    @Override
    public boolean authorize(String username, String password) {
        return false;
    }

    /**
     * Метод для получения доступных билетов
     *
     * @param depTime время отправления в формате LocalDateTime
     * @param route номер маршрута
     * @return возвращает список билетов на выбранную дату
     */
    @Override
    public List<Ticket> getAvailableTickets(LocalDateTime depTime, int route) {
        return null;
    }

    /**
     * Метод для бронировани билета
     *
     * @pre пользователь должен быть авторизован
     * @pre билет должен быть выбран пользователем
     * @pre билет должен быть доступен для бронирования
     * @pre у пользователя на балансе должно быть достаточно средств
     * @post заполняем данные пассажира в выбранном билете
     * @post передаем провайдеру билет для бронирования
     *
     * @param ticket Билет с заполненными данными пассажира
     * @return возвращает true в случа успешного бронирования билета
     */
    @Override
    public boolean reserveTicket(Ticket ticket) {
        return false;
    }

    /**
     * Метод для отмены билета
     *
     * @pre пользователь должн быть авторизован
     * @pre билет болжен быть оформлен этим пользователем
     * @post передаём билет провайдеру для его аннуляции
     *
     * @param ticket билет с заполненными данными пассажира
     * @return
     */
    @Override
    public boolean canselTicket(Ticket ticket) {
        return false;
    }
}
