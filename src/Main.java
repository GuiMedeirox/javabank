import models.Account;
import models.Client;
import models.Employee;
import models.Manager;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        e.setPayment(1000);
        m.setPayment(1000);
        System.out.println("e bonus: "+e.getBonus());
        System.out.println("m bonus: "+m.getBonus());
    }
}