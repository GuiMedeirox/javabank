package models;

public class HumanResources {
    public double getTotalPayment(Employee e){
        return e.getPayment() + e.getBonus();
    }

}
