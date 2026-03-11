import java.util.Scanner;
public class VOTINGELIGIBLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);  
     
     System.out.println(" Enter you age: ");
         int n = sc.nextInt();

        if(n>=18){
            System.out.println(" you are eligible to vote ! ");

            }

            else{
                System.out.println("you are not eligible to vote ");
            }
            sc.close();

        }
    }
    

