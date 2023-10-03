package saleTicketOnline.ticketProvider;

import saleTicketOnline.ticket.Ticket;

import java.time.LocalDateTime;
import java.util.List;

public interface TicketProviderActions {
    /**
     * Получение списка доступных для бронирования билетов
     * @param depTime время отправления в формате LocalDateTime
     * @param route номер маршрута
     * @return возвращает список билетов
     */
    List<Ticket> getAvailableTickets(LocalDateTime depTime, int route);

    /**
     * Бронирование билета, при бронировании он исключается из списка доступных для бронирования билетов
     * и в билет вносятся данные пассажира
     * @param ticket Билет с заполненными данными пассажира
     * @return возвращает true если билет успешно забронировался, и false если нет.
     */
    boolean reserveTicket(Ticket ticket);

    /**
     * отмена оформления билета, при этой операции у него очищаются данные пассажира,
     * и он возвращается в список доступных для бронирования билетов
     * @param ticket билет с заполненными данными пассажира
     * @return возвращает true если билет успешно отменён, и false если нет.
     */
    boolean canselTicket(Ticket ticket);

}
