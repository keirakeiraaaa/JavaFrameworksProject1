public class Student_Main {
    public static void main(String[] args) {
        Student_Roster studentRoster = new Student_Roster();

        //C.1 array of student information
        String[] students = {
              //id name last   email           age    grade
                "1,John,Smith,John1989@gmail.com,20,88,79,59",
                "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
                "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
                "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
                "5, Keira, Black, kblac131@wgu.edu, 26,   91,98,82"};

        for (String info : students) {
            String[] infoSplit = info.split(",");

            String studentID = infoSplit[0].trim();
            String firstName = infoSplit[1].trim();
            String lastName = infoSplit[2].trim();
            String email = infoSplit[3].trim();
            int age = Integer.parseInt(infoSplit[4].trim());

            // assign grade values
            int grade1 = Integer.parseInt(infoSplit[5].trim());
            int grade2 = Integer.parseInt(infoSplit[6].trim());
            int grade3 = Integer.parseInt(infoSplit[7].trim());

            studentRoster.add(studentID, firstName, lastName, email, age, grade1, grade2, grade3);
        }

        // C.2
        // after not being able to test the code in the other .java files it feels really good that the code at least ran first try
        // I don't like that the output feels very unreadable by having no indentation, going to add indentation
        studentRoster.print_all();
        studentRoster.print_invalid_emails();

        for (String info : students) {
            String[] infoSplit = info.split(",");
            String studentID = infoSplit[0];

            studentRoster.print_average_grade(studentID);
        }

        // C.2 (cont))
        studentRoster.remove("3");
        studentRoster.remove("3");
    }
}