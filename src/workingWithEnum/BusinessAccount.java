package workingWithEnum;

public class BusinessAccount extends  Account {

    public BusinessAccount(String ownerName){
        super(ownerName);
        super.setTypeAccount(TypeAccount.BUSINESS_ACCOUNT);
    }

}
