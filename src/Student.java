public class Student {

    //instance variables
    private String studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    private int[] grades;


    // constructor
    public Student(String studentID, String firstName, String lastName, String emailAddress, int age, int[] grades) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.age = age;
        this.grades = grades;
    }

    // accessors
    public String getStudentID() {
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
    public void setStudentID(String studentID) {
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


    // reworked this method so that it prints the correct data
    // that way I can just call this in printAll() instead of having the logic fully written in StudentRoster
    public void print() {
        int[] grades = getGrades();

        String gradesString = ("{" + grades[0] + ", " + grades[1] + ", " + grades[2] + "}");

        System.out.println(
                getStudentID() + "\t" +
                getFirstName() + "\t" +
                getLastName() + "\t" +
                getEmailAddress() + "\t" +
                getAge() + "\t" +
                gradesString
        );



    }
}