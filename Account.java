package courseJava.Bank;

public class Account {
    Safe safeObject;
    String name;
    String password;

    public Account(String name, String password, Safe s){
        this.name = name;
        this.password = password;
        this.safeObject = s;
    }

    public Safe getSafeObject() {
        return safeObject;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setSafeObject(Safe safeObject) {
        this.safeObject = safeObject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
