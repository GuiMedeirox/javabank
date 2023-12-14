package models;

public class CurrentAccount extends Account{

    @Override
    public void toWithdraw(float money) {
        float finalValue = money + 0.5f;
        super.toWithdraw(finalValue);
    }

    public CurrentAccount(Client owner){
        super(owner);
    }
}
