package models;

public class BusinessClient extends Client implements Authenticate{

    private Authentication auth;

    @Override
    public void setPassword(int pass){
        auth.setPassword(pass);
    }
    @Override
    public boolean toAuth(int pass){
        return auth.toAuth(pass);
    }

    public BusinessClient(){
        this.auth = new Authentication();
    }

}
