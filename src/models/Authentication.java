package models;

public class Authentication {
    private int password;

    public void setPassword(int pass ) {
        this.password = pass;
    }

    public boolean toAuth(int pass){
        return this.password == pass;
    }
}
