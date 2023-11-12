package models;

public class Account {
    private float balance;
    private double agency;
    private double number;
    private Client owner;

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }


    public float getBalance() {
        return balance;
    }

    public double getAgency() {
        return agency;
    }


    public double getNumber() {
        return number;
    }

    public void toWithdraw(float money){
        if(this.balance < 0 || this.balance < money){
            System.out.println("Sorry, you don't have enough money ");
        }else{
            this.balance -= money;
        }
    }

    public void toDeposit(float money){
        if(money > 0) {
            this.balance += money;
        }
    }

    public Account(Client owner){
        this.agency = Math.floor(Math.random() *(999999));
        this.number = Math.floor(Math.random() *(999999));
        this.owner = owner;
    }

    public Account(){
        this(null);

    }


}

