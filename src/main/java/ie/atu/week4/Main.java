//Dónal Ó Maoilchiaráin
//student app



package ie.atu.week4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name ");
        String studentName = sc.nextLine();
        System.out.println("Please enter email ");
        String studentEmail = sc.nextLine();
        System.out.println("Please enter Course");
        String studentCourse = sc.nextLine();*/

        Student s = new Student(); // default constructor
        s.setName("tom");
        s.setEmail("tom@atu.ie");
        s.setCourse("arts");
        System.out.println( s.toString());

        Student p = new Student("joe"); // name constructor
        p.setEmail("Joe@atu.ie");
        p.setCourse("Law");
        System.out.println( p.toString());

        Student e = new Student("eve", "eve@atu.ie", "civil");
        System.out.println(e.toString());


    }
}