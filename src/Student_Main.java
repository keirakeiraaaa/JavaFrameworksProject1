public class Student_Main {
    public static void main(String[] args) {
        //test for commiting test
        Student_Roster studentRoster = new Student_Roster();

        Student student = new Student("1", "firstName", "lastName", "Hello@.com", 22);

        student.print();
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
         */

        // TODO figure out how to create array inside of class()

        studentRoster.add("1", "John", "Smith", "JohnSmith1989@gmail.com", 20, 88, 79, 59);
        studentRoster.add("2", "Suzan", "Erickson", "Erickson_1990@gmail.com", 19, 92, 72, 85);
        studentRoster.add("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, 85, 84, 87);
        studentRoster.add("5", "Erin", "Black", "Erin.Black@comcast.net", 22, 91, 98, 82);
        studentRoster.add("6", "Keira", "Black", "kblac131@wgu.edu", 26, 99, 98, 100);



        studentRoster.print_all();
        studentRoster.print_invalid_emails();

        // TODO loop through students to get their average grade
        System.out.println(studentRoster);



    }
}