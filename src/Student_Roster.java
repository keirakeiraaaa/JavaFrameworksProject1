import java.util.ArrayList;
public class Student_Roster {
    private ArrayList<Student> studentRoster = new ArrayList<>();

    public void add(String studentID, String firstName, String lastName, String emailAddress, int age, int grade1, int grade2, int grade3) {

        int[] grades = {grade1, grade2, grade3};

        Student student = new Student(studentID, firstName, lastName, emailAddress, age, grades);

        studentRoster.add(student);
    }

    public void remove(String studentID) {
        for (Student student : studentRoster) {
            if (student.getStudentID().equals(studentID)) {
                studentRoster.remove(student);
            } else {
                System.out.println("Error: student with ID " + studentID + " not found");
            }
        }
    }

    public void print_all() {
        for (Student student : studentRoster) {
            int[] grades = student.getGrades();

            String gradesString = "{" + grades[0] + "," + grades[1] + "," + grades[2] + "}";
            System.out.print(student.getStudentID()+"\t");
            System.out.print(student.getFirstName()+"\t");
            System.out.print(student.getLastName()+"\t");
            System.out.print(student.getEmailAddress()+"\t");
            System.out.print(student.getAge()+"\t");
            System.out.print(gradesString);
            System.out.println();
        }
    }
}
