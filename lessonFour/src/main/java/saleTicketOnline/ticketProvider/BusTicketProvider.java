package saleTicketOnline.ticketProvider;

import saleTicketOnline.ticket.BusTicket;
import saleTicketOnline.ticket.Ticket;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс поставщика автобусных билетов.
 */

public class BusTicketProvider implements TicketProviderActions {

    private final List<BusTicket> busTickets = new ArrayList<>();;

    public BusTicketProvider() {
        busTickets.add(new BusTicket(1001, LocalDateTime.now(), 104, 30));
    }

    /**
     * Метод получает автобусные билеты доступные для бронирования.
     * @param depTime время отправления в формате LocalDateTime
     * @param route номер маршрута
     * @return список доступных автобусных билетов
     */
    @Override
    public List<Ticket> getAvailableTickets(LocalDateTime depTime, int route) {
        return null;
    }

    /**
     * метод бронирования билета
     * @param ticket Билет с заполненными данными пассажира
     * @return возвращает true в случае успешного бронировани, и false если операция не пройдёт
     */
    @Override
    public boolean reserveTicket(Ticket ticket) {
        return false;
    }

    /**
     * Метод для отмены билета, при отмене информация о пассажире будет очищена,
     *  и билет вернётся в список доступных для бронирования
     * @param ticket билет с заполненными данными пассажира
     * @return возвращает true в случае успешной отмены, и false если операция не пройдёт
     */
    @Override
    public boolean canselTicket(Ticket ticket) {
        return false;
    }
}
