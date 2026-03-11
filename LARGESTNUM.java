import java.util.Scanner;

public class LARGESTNUM {
    public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);

          System.out.println("Enter the first number : ");
           int a = sc.nextInt();
           System.out.println("Enter the first number : ");
           int b = sc.nextInt();
            System.out.println("Enter the first number : ");
           int c = sc.nextInt();


           if(a>b ){
            System.out.println(a+ " is the gratest number ! ");

           }
          else if(b>c ){
            System.out.println(b+ " is the gratest number ! ");

    }

    else {
        System.out.println(c+" is the greatest number ");
    }
    sc.close();
    
}}
