package models;

public class Manager extends Employee {
    private int password;
    public boolean auth(int pass){
        if (pass == this.password) return true;
        else return false;
    }
    @Override
    public double getBonus() {
        return super.getPayment()*5;
    }
}
