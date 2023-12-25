package workingWithEnum;

public class CurrentAccount extends Account {


    public CurrentAccount(String ownerName) {
        super(ownerName);
       super.setTypeAccount(TypeAccount.PERSONAL_ACCOUNT);
    }
}
