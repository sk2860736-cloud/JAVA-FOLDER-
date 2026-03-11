import java.util.Scanner;
public class EVENORODD {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);

      System.out.println("Enter you n number: ");
        int n = sc.nextInt();

        if (n%2==0){
        System.out.println(" the number is even ! ");
        }
         else{
            System.out.println(" the number is odd! ");
         }

        sc.close();   
    }

    
}
