package DAY28_GENERICS;

public class DAY28_05 {
        // generics --> T can be anything 
        /*
           1. Bound in Generics --> 
           Upper Bound Generics --> T is atleast Number or its substype.  
         */

    public static void main(String[] args) {
        Box<Integer> b1 = new Box <> ();
        b1.value = 5;
        b1.PrintDouble();

    }
    
}
class Box <T extends Number>{
    T value;

    public void PrintDouble(){
        System.out.println(value.doubleValue());
    }

}
