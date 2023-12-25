package finalModificator;

public class CurrentAccount extends Account {


    public CurrentAccount(String ownerName) {
        super(ownerName);
        super.setType("Current");
    }
}
