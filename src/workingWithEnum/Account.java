package workingWithEnum;

public abstract class Account {
    public final Client owner = new Client();
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
    public TypeAccount getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(TypeAccount typeAccount) {
        this.typeAccount = typeAccount;
    }

    private TypeAccount typeAccount;

    public Client getOwner() {
        return owner;
    }


    public Account(String ownerName){
        this.owner.setName(ownerName);
    }

    @Override
    public String toString() {
        return "Type Literal: " +this.typeAccount +" || Tax: " +this.typeAccount.VALUE +" || Type abbreviation " +this.typeAccount.TYPE;
    }
}

