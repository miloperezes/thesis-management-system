package ph.edu.dlsu.lbycpei.loginexample;

public abstract class User {

    protected String name;
    protected String password;
    protected double accessLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String weight) {
        this.password = password;
    }

    public double getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(double atk) {
        this.accessLevel = accessLevel;
    }

}
