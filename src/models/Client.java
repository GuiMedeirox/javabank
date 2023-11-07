package models;

public class Client {
    private float balance;
    private int agency;
    private int number;
    private String owner;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void toWithdraw(float balance, float money){
        if(balance < 0 || balance < money){
            System.out.println("Sorry, you don't have enough money ");
        }else{
            this.balance -= money;
        }
    }



}
