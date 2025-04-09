package ph.edu.dlsu.lbycpei.loginexample;

public class Student extends User{

    public Student(){
        name = getName();
        password = getPassword();
        accessLevel = getAccessLevel();
    }

    public Student(String name, String password, Double accessLevel){

        this.name = name;
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public Student(String[] Info){
        name = getName();
        password = getPassword();
        accessLevel = getAccessLevel();
    }

}
