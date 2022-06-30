import java.util.Scanner;

public class Course {
    int courseId;
    String courseName;
    int courseFee;

  public void  displayCourseDetails(){
      System.out.println( "course id is "+this.courseId);
      System.out.println("course name is "+this.courseName);
      System.out.println("course fee is "+this.courseFee);
  }
  public static void authenticate(String username,String Password){
      if(username=="Admin" && Password=="1234"){
          Scanner sc1=new Scanner(System.in);
          System.out.println("Enter course name");
          String s1=new String(sc1.nextLine());
          System.out.println("Enter course id");
          int i1=sc1.nextInt();
          System.out.println("Enter course fee");
          int i2=sc1.nextInt();
          Course c1=new Course();
          c1.courseName=s1;
          c1.courseId=i1;
          c1.courseFee=i2;



          c1.displayCourseDetails();




      }
      else{
          System.out.println("Invalid username or password");
      }

  }

    public static void main(String[] args) {

      authenticate("Admin","1234");

    }
}
