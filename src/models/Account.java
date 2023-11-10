package models;

public class Account {
    private float balance;
    private int agency;
    private int number;

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    private Client owner;

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

    public void toWithdraw(float money){
        if(this.balance < 0 || this.balance < money){
            System.out.println("Sorry, you don't have enough money ");
        }else{
            this.balance -= money;
        }
    }

    public void toDeposit(float money){
        this.balance += money;
    }


}
