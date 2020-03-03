public class Test {

    public static void main(String[] args) {

        School NSHS = new School();

        NSHS.addInstructor(1234,"Bob Dylan", "dylan@gmail.com", "8314426935");

        System.out.println(NSHS.getInstructorList().toString());




    }


}
