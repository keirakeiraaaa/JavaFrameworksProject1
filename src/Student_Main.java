public class Student_Main {
    public static void main(String[] args) {
        Student_Roster studentRoster = new Student_Roster();

        //array of student information
        String[] students = {
              //id name last   email           age    grade
                "1,John,Smith,John1989@gmail.com,20,88,79,59",
                "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
                "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
                "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
                "5, Keira, Black, kblac131@wgu.edu, 26,   91,98,82"};


        // TODO create loop that seperates each collumn into it's own data type
        // TODO inside loop add this student to the student Roster

        for (String info : students) {
            String[] infoSplit = info.split(",");

            String studentID = infoSplit[0];
            String firstName = infoSplit[1];
            String lastName = infoSplit[2];
            String email = infoSplit[3];
            int age = Integer.parseInt(infoSplit[4].trim());

            // TODO create array to hold grade

            System.out.println(age);


        }

        //correction to logic of code
        // instructions ask user to declare an Array with the information supplied for each student
        // we don't need to use the studentRoster indivudal students assigned inside of the Roster to print average
        // we use the created array to loop through and grab each student

        // TODO create array with student information
        /*
         I'm lost
         I don't know how to create an array that actually holds all the information per student
         if you create an array you can specify amount of information on array creation
         HOWEVER the information is:
         1. type specific
         2. put into format of {"1", "name" "lastName"} etc,

         ideas:
         1. create array inside array?
                create array of type student within an array of type ?? I don't know
         2. Student student1 = new Student();
                issue with this is that you need to fill Student() with information specified in Student.class
                I tried to manually input that information but it did not work
         3. Maybe it is ok to just have everything in long format?
            like
            array name = array {
                "1", "name", "lastName", "email", int[grade]

                I don't know how that could be possible though


           SOLUTION?:
           I went through and removed the array items from inside student's class which seems to be working
           if I just run student.print() it's printing out all the information, I could then use this in studentRoster.add();

           //keeping previous comments so I can keep track of ideas


           new problem:
           I can't do studentRoster.add(student) to input a student, the add information has to be actually information

         */

        // TODO figure out how to create array inside of class()


        // TODO uncomment
        //studentRoster.print_all();
        //studentRoster.print_invalid_emails();

        // TODO loop through students to get their average grade



    }
}