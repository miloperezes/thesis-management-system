package ph.edu.dlsu.lbycpei.loginexample;

public class Administrator extends User{

    public Administrator(){
        name = getName();
        password = getPassword();
        accessLevel = getAccessLevel();
    }

    public Administrator(String name, String password, Double accessLevel){

        this.name = name;
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public Administrator(String[] Info){
        name = getName();
        password = getPassword();
        accessLevel = getAccessLevel();
    }

}
