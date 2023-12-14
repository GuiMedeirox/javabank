import models.*;

public class Main {
    public static void main(String[] args) {
        Client c = new Client();
        c.setName("Carl Johnson");
        CurrentAccount a = new CurrentAccount(c);
        a.toDeposit(100);
        a.toWithdraw(20);
        System.out.println(a.getBalance());

    }
}