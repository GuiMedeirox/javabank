import models.*;

public class Main {
    public static void main(String[] args) {
        BusinessClient c1 = new BusinessClient();
        PersonalClient c2 = new PersonalClient();

        c1.setName("Carl");
        c2.setName("John");
        c1.setPassword(1234);
        System.out.println(c1.toAuth(1234));

    }
}