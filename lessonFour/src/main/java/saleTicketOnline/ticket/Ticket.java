package saleTicketOnline.ticket;

import java.time.LocalDateTime;
/**
 * Базовый абстрактный класс билета
 *  */
public abstract class Ticket implements TicketActions {
    protected int ticketNumber;
    protected String name;
    protected String surname;
    protected String id;
    protected LocalDateTime departureTime;

    public Ticket(int ticketNumber, LocalDateTime departureTime) {
        this.ticketNumber = ticketNumber;
        this.departureTime = departureTime;
    }

    /**
     * Получить номер билета
     * @return возвращает номер билета
     */
    public int getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Получить время отправления
     * @return возвращает время отправления
     */
    public LocalDateTime getDepartureTime() {
        return departureTime;
    }





}
