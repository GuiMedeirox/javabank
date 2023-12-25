package finalModificator;

public abstract class Account {
    private float balance;
    public final Client owner = new Client();
    public static final int  WITHDRAW_LIMIT = 1000;
    /*  alternative methods to start the constant
    *  static{
    *   WITHDRAW_LIMIT = 1000;
    * }
    * if our constant wouldn't be static...
    * public final int WITHDRAW_LIMIT;
    * {
    *   WITHDRAW_LIMIT
    * }
    *
    * */
    private final double agency;
    private final double number;

    private String type;

    public Client getOwner() {
        return owner;
    }

    public float getBalance() {
        return balance;
    }

    public double getAgency() {
        return agency;
    }

    public void toTransfer(float value, Account b){
        if( this.balance >= value ){
            b.toDeposit(value);
            this.balance -= value;
        }
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

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Account(String ownerName){
        this.agency = Math.floor(Math.random() *(999999));
        this.number = Math.floor(Math.random() *(999999));
        this.owner.setName(ownerName);
    }


}

