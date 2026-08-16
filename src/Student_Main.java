public class Student_Main {
    public static void main(String[] args) {
        //test for commiting test
        Student_Roster studentRoster = new Student_Roster();

        studentRoster.add("1", "John", "Smith", "JohnSmith1989@gmail.com", 20, 88, 79, 59);
        studentRoster.add("2", "Suzan", "Erickson", "Erickson_1990@gmail.com", 19, 92, 72, 85);
        studentRoster.add("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, 85, 84, 87);
        studentRoster.add("5", "Erin", "Black", "Erin.Black@comcast.net", 22, 91, 98, 82);
        studentRoster.add("6", "Keira", "Black", "kblac131@wgu.edu", 26, 99, 98, 100);

        studentRoster.print_all();
        studentRoster.print_invalid_emails();

    }
}