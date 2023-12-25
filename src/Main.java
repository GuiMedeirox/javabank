import workingWithEnum.*;

public class Main {
    public static void main(String[] args) {
        Client c = new Client();
        Account BA = new BusinessAccount("John Doe");
        Account CA = new CurrentAccount("Carl Johnson");

        System.out.println(BA.getTypeAccount().getTariff(1000));
        System.out.println(CA.getTypeAccount().getTariff(1000));

    }
}