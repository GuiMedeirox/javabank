import models.Account;
import models.Client;

public class Main {
    public static void main(String[] args) {
        Account a = new Account();
        System.out.println(a.getAgency() +" " +a.getOwner());

    }
}