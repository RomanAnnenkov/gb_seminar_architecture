package saleTicketOnline.user;

public interface UserActions {
    boolean isAuthorized();

    int getBalance();
    void setBalance(int balance);

}
