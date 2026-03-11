import java.util.Scanner;

public class tenthquestion {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
     System.out.println(" enter the year ");
       int n = sc.nextInt();

       if (n % 400 == 0 || n % 4 == 0 ){
        System.out.println(" the year is leap year ");
 
       }
      
      else{
        System.out.println("non leap yaer ");
      }

       sc.close();
    }
    
}
