import models.*;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee m = new Manager();
        HumanResources RH = new HumanResources();
        e.setName("Carl Johnson");
        m.setName("John Doe");
        e.setCpf("12345678909");
        m.setCpf("09876543212");
        RH.getInformations(e);
        System.out.println("----");
        RH.getInformations(m);

    }
}