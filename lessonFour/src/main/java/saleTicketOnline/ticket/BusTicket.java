package saleTicketOnline.ticket;

import java.time.LocalDateTime;

/**
 * Класс билета на автобус
 */
public class BusTicket extends Ticket {

    private final int routeId;
    private int price;

    public BusTicket(int ticketNumber, LocalDateTime departureTime, int routeId, int price) {
        super(ticketNumber, departureTime);
        this.routeId = routeId;
    }

    /**
     * задаёт имя пассажира
     * @param name строка с именем
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     * Задаёт фамилию пассажира
     * @param surname строка с фамилией
     */
    @Override
    public void setSurname(String surname) {
        super.surname = surname;
    }

    /**
     * Задаёт уникальный документ пассажира
     * @param id уникальный документ пассажира
     */
    @Override
    public void setID(String id) {
        super.id = id;
    }
}
