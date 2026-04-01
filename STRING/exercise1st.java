import java.util.Scanner;


public class exercise1st {
    public static void main(String[] args){
        System.out.println("taking Input from the user! ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of math : ");
        float Math = sc.nextFloat ();
        System.out.println("enter the marks of phy : ");
        float Phy = sc.nextFloat ();
        System.out.println("enter the marks of chem : ");
        float Chem = sc.nextFloat ();
        System.out.println("enter the marks of bio : ");
        float Bio = sc.nextFloat ();
        System.out.println("enter the marks of english : ");
        float English = sc.nextFloat ();
float percentage = (Math+Phy+Chem+Bio+English)*100/500;
System.out.println("the total subjects of the number of percentage is :");
System.out.println(percentage);
sc.close();
    }

}