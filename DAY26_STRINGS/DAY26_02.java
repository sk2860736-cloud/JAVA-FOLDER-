package DAY26_STRINGS;

public class DAY26_02 {
    public static void main(String[] args) {
        // String s1 = "Sachin";
        // String s2 = "Sachin";
        // System.out.println(s1 == s2); //  true 

        // Deside Compile time 

        // String s3 = "ja" + "va";
        // String s4 = "java";
        // System.out.println(s3 == s4); // true 

        // Deside Run time 

        // String s5 = "Hello";
        // String s6 = s5 + "World";
        // System.out.println(s5 == s6); // false 

        // String s7 = "java";
        // String s8 = s7;
        // System.out.println(s7 == s8); // true 

        // String s9 = "sachin";
        // s9 = "sufaid";
        // System.out.println(s9); // sufaid 

        String s1 = new String("Hello"); // hello in string pool
        String s2 = "Hello"; // its point to older hello in string pool 
        System.out.println(s1 == s2); // false

    }
    
}
