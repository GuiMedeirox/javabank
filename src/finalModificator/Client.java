package finalModificator;

public class Client {

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", CPF='" + CPF + '\'' +
                ", password=" + password +
                '}';
    }

    private String name;
    private String CPF; //brazillian ID
    private int password;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}