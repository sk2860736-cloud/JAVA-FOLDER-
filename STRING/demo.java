import java.util.Scanner;

public class demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter marks of 5 subjects:");

            float math = sc.nextFloat();
            float phy = sc.nextFloat();
            float chem = sc.nextFloat();
            float bio = sc.nextFloat();
            float english = sc.nextFloat();

            float total = math + phy + chem + bio + english;
            float percentage = (total / 500) * 100;

            System.out.println("Percentage: " + percentage);
        } 
        catch (Exception e) {
            System.out.println("Invalid input! Please enter only numbers.");
        }

        sc.close();
    }
}
    
