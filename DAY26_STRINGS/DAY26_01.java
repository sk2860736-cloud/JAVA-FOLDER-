package DAY26_STRINGS;

public class DAY26_01 {
    public static void main(String[] args) {
        // using literals ();

        String s1 = "Sachin";
        String s2 = "Sachin";
        System.out.println(s1 == s2);

        // using new ();

        String s3 = new String("Sachin");
        String s4 = new String("Sachin");

        System.out.println(s3 == s4);

    }
    
}

// Golden Rule -->
// Only compile time constant go to String pool automatically. 
// Runtime created String go to Heap.

