package saleTicketOnline.user;

/**
 * интерфейс действий с пользователем
 */
public interface UserActions {
    /**
     * Метод для получения информации о авторизации пользователя
     * @return возвращает true, если пользователь авторизован, иначе false
     */
    boolean isAuthorized();

    /**
     * Метод для получения текуего баланса пользователя
     * @return текущий баланс пользователя
     */
    int getBalance();

    /**
     * Изменяет текущий баланс пользователя
     * @param balance новый баланс пользователя
     */
    void setBalance(int balance);

}
