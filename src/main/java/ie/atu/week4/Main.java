//Dónal Ó Maoilchiaráin
//student app



package ie.atu.week4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //prompt for student 1 details
        String[] student1 = getDetails();
        Student s = new Student(); // default constructor
        s.setName(student1[0]); // sets index of array
        s.setEmail(student1[1]);
        s.setCourse(student1[2]);


        String[] student2 = getDetails();
        Student p = new Student(student2[0]); // name parameter constructor. no need for setName
        p.setEmail(student2[1]);
        p.setCourse(student2[2]);


        String[] student3 = getDetails();
        Student e = new Student(student3[0],student3[1],student3[2]); //constructor that accepts all arguments

        System.out.println( s.toString(1)); // to string added number for output
        System.out.println( p.toString(2));
        System.out.println( e.toString(3));



    }

    public static String[] getDetails()
    {
        // prompt user for details
        Scanner sc = new Scanner(System.in);
        String[] details = new String[3];
        System.out.println("Please enter name ");
        details[0] = sc.nextLine(); // sets first index of array to name
        System.out.println("Please enter email ");
        details[1] = sc.nextLine();// sets second index to email
        System.out.println("Please enter Course");
        details[2] = sc.nextLine(); // sets third to course
        return details;
    }


}