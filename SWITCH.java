import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);

         System.out.println("Enter the day: ");
         int n = sc.nextInt();

         
        switch (n){
            case 1: 
            System.out.println("today is monday! ");
            break;
            
              case 2: 
            System.out.println("today is tuesday ! ");
            break; 

              case 3: 
            System.out.println("today is wednesday ! ");
            break; 

              case 4: 
            System.out.println("today is thursday ! ");
            break; 

              case 5: 
            System.out.println("today is friday ! ");
            break;

              case 6: 
            System.out.println("today is saturaday ! ");
            break;

              case 7: 
            System.out.println("today is sunday ! ");
            break; 
        
        }

         sc.close();
    }
    
}
