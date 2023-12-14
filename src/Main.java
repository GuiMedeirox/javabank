import models.*;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        m.setPayment(1000);
        e.setPayment(1000);
        HumanResources RH = new HumanResources();
        System.out.println(RH.getTotalPayment(e));

    }
}