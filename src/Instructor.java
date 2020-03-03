public class Instructor {

    private int employeeNum;
    private String email, name, phoneNum;

    // Constructor
    public Instructor(int employeeNum, String name, String email, String phoneNum) {
        this.employeeNum = employeeNum;
        this.phoneNum = phoneNum;
        this.email = email;
        this.name = name;
    }

    // Setters and Getters
    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String toString(){
        String temp;
        temp = (employeeNum+ ", " + name + ", " + email + ", " + phoneNum);
        return temp;

    }
}
