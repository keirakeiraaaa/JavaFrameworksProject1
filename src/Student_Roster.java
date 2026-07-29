import java.util.ArrayList;
public class Student_Roster {
    // this is the most important ArrayList of the whole program
    // used to store each student into the actual roster of students
    private ArrayList<Student> studentRoster = new ArrayList<>();

    public void add(String studentID, String firstName, String lastName, String emailAddress, int age, int grade1, int grade2, int grade3) {
        int[] grades = {grade1, grade2, grade3};

        Student student = new Student(studentID, firstName, lastName, emailAddress, age, grades);

        studentRoster.add(student);
    }

    // studentID method:
    // removes student by using user provided studentID
    public void remove(String studentID) {
        for (Student student : studentRoster) {
            if (student.getStudentID().equals(studentID)) {
                studentRoster.remove(student);
                return;
            }
        }
        System.out.println("Error: student with ID " + studentID + " not found");
    }

    public void print_all() {
        for (Student student : studentRoster) {
            student.print();
        }
    }

    // print average grade method:
    public void print_average_grade(String studentID) {
        for (Student student : studentRoster) {
            if (student.getStudentID().equals(studentID)) {
                int sum = 0;
                int counter = 0;
                for (int grade: student.getGrades()) {
                    sum += grade;
                    counter += 1;
                }
                double average = (double) sum / counter;
                System.out.println(student.getStudentID() + " average: "  + average);
                return;
            }
        }
    }

    // invalid emails method:
    public void print_invalid_email() {
        for (Student student : studentRoster) {
            String studentEmail = student.getEmailAddress();

            // uses '!' in front of student.contains() statements to ensure the email DOES NOT contain these characters
            if (!studentEmail.contains("@") || !studentEmail.contains(".") || studentEmail.contains(" ")) {
                System.out.println(student.getEmailAddress());
            }
        }
    }
}
