package saleTicketOnline.ticket;

/**
 * интерфейс действий с пользователем
 */
public interface TicketActions {
    /**
     * Задаёт имя пассажира
     * @param name строка с именем
     */
    void setName(String name);

    /**
     * Задаёт фамилию пассажира
     * @param surname строка с фамилией
     */
    void setSurname(String surname);
    void setID(String ID);

}
