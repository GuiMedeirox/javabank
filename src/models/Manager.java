package models;

public class Manager extends  Employee {
    private int password;
    public boolean auth(int pass){
        if(pass == this.password){
            return true;
        }
        else {
            return false;
        }
    }
}
