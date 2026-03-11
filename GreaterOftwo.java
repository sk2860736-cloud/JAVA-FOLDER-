import java.util.Scanner;

public class GreaterOftwo {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
       System.out.println("Enter you first number: ");
           int x = sc.nextInt();

           System.out.println("Enter your 2nd number: ");
              int y = sc.nextInt(); 

              if (x > y  ){
                System.out.println(x + " is greater then 2nd number  ! ");

              }
            
              else if (x < y){
                System.out.println( y +" is greater then first number !");
              }
              else {
                System.out.println(" both are equal ");
              }

              sc.close();
              
    }
    
}
