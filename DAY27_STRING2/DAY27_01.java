package DAY27_STRING2;

public class DAY27_01 {
    public static void main(String[] args) {
        // String s1 = new String(); // empty 
        // System.out.println(s1);

        // String s2 = new String("Sachin");
        // System.out.println(s2);

        // String s3 = "Sachin";
        // String s4 = new String(s3);  // s3 in s4 
        // System.out.println(s4);

        // char Array --> 
        // char [] arr = {'S','a','c','h','i','n',' ', 'G','u','p','t','a'};
        // String s5 = new String(arr);
        // System.out.println(s5);

        //  String s5 = new String(arr,0,8);
        //  System.out.println(s5);

        // byte []arr = {97,98,99}; // abc
        // String s6 = new String(arr,0,3);
        // System.out.println(s6); // abc
        
        StringBuffer sb = new StringBuffer("Sachin Gupta");
        System.out.println(sb);

        StringBuilder sbi = new StringBuilder("Sachin Gupta");
        System.out.println(sbi);
    }
    
}

/*
new String () 
new String (String)
new String (char[])
new String (byte[])
new String(StringBuilder)
new String(StringBuffer)
 */
