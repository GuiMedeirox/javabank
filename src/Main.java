import models.Client;
public class Main {
    public static void main(String[] args) {
        System.out.println("This is a simple CLI bank");

        Client c = new Client();
        c.setBalance(100);
        c.setOwner("Carl Johnson");
        c.toWithdraw(20.5f);
        System.out.println(c.getBalance());
    }
}