import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class School {


    private ArrayList<Instructor> instructorList = new ArrayList<Instructor>();
    private ArrayList<Course> courseList = new ArrayList<Course>();
    private ArrayList<Student> studentList = new ArrayList<Student>();

    public void addInstructor(int employeeNum, String name, String email, String phoneNum){

        instructorList.add(new Instructor(employeeNum, name, email, phoneNum));

    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public ArrayList<Instructor> getInstructorList() {
        return instructorList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void readData(String filename) throws FileNotFoundException {

        Scanner scan = new Scanner(new File(filename));

        while(scan.hasNext()){

            scan.nextInt() = 




        }









    }

}