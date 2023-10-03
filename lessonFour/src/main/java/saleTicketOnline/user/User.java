package saleTicketOnline.user;

/**
 * класс пользователя системы
 */
public class User implements UserActions {
    private String email;
    private int balanse;

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    /**
     * Метод для получения электронной почты пользователя
     * @return возвращает строку с адресом электронной почты
     */
    public String getEmail() {
        return email;
    }

    /**
     * Метод для получения имени пользователя
     * @return возвращает строку с именем пользователя
     */
    public String getName() {
        return name;
    }

    /**
     * метод для изменения электронной почты пользователя
     * @param email строка с адресом электронной почты
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * метод для изменения флага isAuthorized
     * @param authorized результат авторизации true или false
     */
    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }

    /**
     * Метод для изменения имени пользователя
     * @param name строка с новым именем пользователя
     */
    public void setName(String name) {
        this.name = name;
    }

    private boolean isAuthorized;
    private String name;

    /**
     * Метод для получения информации о авторизации пользователя
     * @return возвращает true, если пользователь авторизован, иначе false
     */
    @Override
    public boolean isAuthorized() {
        return isAuthorized;
    }

    /**
     * Метод для получения текуего баланса пользователя
     * @return текущий баланс пользователя
     */
    @Override
    public int getBalance() {
        return balanse;
    }

    /**
     * Изменяет текущий баланс пользователя
     * @param balance новый баланс пользователя
     */
    @Override
    public void setBalance(int balance) {
        this.balanse = balance;
    }
}
