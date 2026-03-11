import java.util.Scanner;

public class TEMPCATGORIES {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in); 
      
      System.out.println("Enter the temprature: " );
        int temp = sc.nextInt();

        if (temp < 10){
            System.out.println(" temperature is very good !");

        }

        else if ( temp >=10 && temp <=25  ){
            System.out.println(" temperature is moderate ");

        }
       else{
        System.out.println(" tempretature is hot ");
       }

       sc.close();
    }
    
}
