public class Student {


    private String name;
    private int uniqueID;

    // Constructor
    public Student(String name, int uniqueID) {
        this.name = name;
        this.uniqueID = uniqueID;
    }

    // Setters and Getters;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }
}

