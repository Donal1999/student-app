package ie.atu.week4;

public class Student {
     private String name ;
     private String email;
     private String course;

     public Student() { //default constructor
          this.name=null;
          this. email=null;
          this. course=null;
     }

     public Student(String name) { // constructor name only parameter
          this.name = name;
          this. email=null;
          this. course=null;
     }

     public Student(String name, String email, String course) { // constructor that  accepts name,email and course
          this.name = name;
          this.email = email;
          this.course = course;
     }

     public String getName() {  //getter
          return name;
     }

     public void setName(String name) { //setter
          this.name = name;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getCourse() {
          return course;
     }

     public void setCourse(String course) {
          this.course = course;
     }


     public String toString(int number) { //  int argument to add number to output
          return "Student " + number  + " details are " +
                  "name='" + name + '\'' +
                  ", email='" + email + '\'' +
                  ", course='" + course + '\'' ;
     }
}
