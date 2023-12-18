package models;

public class Director extends Employee{
    private int password;

    @Override
    public double getBonus(){
        return super.getPayment()*10;
    }
}
