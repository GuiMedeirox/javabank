package models;

public class PersonalClient extends Client implements Authenticate{
    private Authentication auth;
    @Override
    public void setPassword(int pass){
        auth.setPassword(pass);
    }
    @Override
    public boolean toAuth(int pass){
        return auth.toAuth(pass);
    }

    public PersonalClient(){
     this.auth = new Authentication();
    }
}
