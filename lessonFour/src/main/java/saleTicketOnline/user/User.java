package saleTicketOnline.user;

public class User implements UserActions {
    private String email;
    private int balanse;

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean isAuthorized;
    private String name;

    @Override
    public boolean isAuthorized() {
        return isAuthorized;
    }


    @Override
    public int getBalance() {
        return balanse;
    }

    @Override
    public void setBalance(int balance) {
        this.balanse = balance;
    }
}
