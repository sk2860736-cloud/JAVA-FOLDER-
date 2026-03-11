package LECTURE06;

public class DEMO {
    public static void main(String[] args) {
        // RELATIONAL OPERATOR --> ==, !=, <,>, <= , >= 
        int a = 5;
        int b= 10;  

        boolean c = (a==b);
        System.out.println(c); // False 
        
        boolean d = (a!=b); // True 
        System.out.println(d);

        boolean e = (a<b); // true 
        boolean f = (a<=b); //true 

        System.out.println(e);
        System.out.println(f);

        // bitwise operator --> bit manupulation 
        // &, !, ^, ~, <<, >>, >>>, &=, !=, ^=, >>=, <<= , >>>= 
        int l = (a & b);
        System.out.println(l);

    }
    
}
