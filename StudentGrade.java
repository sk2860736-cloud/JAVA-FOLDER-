import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);

       System.out.println("Enter the grade of student: ");
        int n = sc.nextInt();

      if(n >= 90 ){
        System.out.println("students grade is A ");

      }
        else if(n >= 75 ){
        System.out.println("students grade is B  ");
        }

        else if(n >= 60 ){
        System.out.println("students grade is C  ");
    }
    else if(n >= 40 ){
        System.out.println("students grade is D  ");
    }
    else {
        System.out.println(" the student is FAIL ");
    }
    sc.close();
    }
    
    
}
