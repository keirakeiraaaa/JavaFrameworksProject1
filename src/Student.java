public class Student {

    //instance variables
    private int studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    private int[] grades;


    // constructor
    public Student(int studentID, String firstName, String lastName, String emailAddress, int age, int[] grades) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.age = age;
        this.grades = grades;
    }

    // accessors
    public int getStudentID() {
        return this.studentID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public int getAge() {
        return this.age;
    }

    public int[] getGrades() {
        return this.grades;
    }


    //mutators
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void print() {

        //print statemets:
        //using System.out.print instead of println to get everything on one line
        System.out.print(this.studentID);
        System.out.print(this.firstName);
        System.out.print(this.lastName);
        System.out.print(this.emailAddress);
        System.out.print(this.age);

        int counter = grades.length; // needed to confirm how many iterations to add commas between grades
        for (int grade : this.grades) {
            if (counter > 0) {
                System.out.print(grade + ", ");
            } else {
                System.out.print(grade);
            }
        }
    }
}
