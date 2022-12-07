

public class Employee {

    public String name;
    public String pps;

    public Employee(String name, String pps) {

        if(name.length() >= 5 || name.length() <= 30) {
            setname();
        }
        else {
            throw new IllegalArgumentException("Invalid name, must be between 5 and 30 characters");
        }

        if(pps.length() == 6) {
            setpps();
        }

        else {
            throw new IllegalArgumentException("Employee PPS number should be 6 characters");
        }

    }


    public String getname() {
        return name;
    }
    public void setname() {
        this.name = name;
    }

    public String getpps() {
        return pps;
    }
    public void setpps() {
        this.pps = pps;
    }
}