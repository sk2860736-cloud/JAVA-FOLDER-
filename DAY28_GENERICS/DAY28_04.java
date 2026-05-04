package DAY28_GENERICS;

public class DAY28_04 {
    // 1st method --> 

//     public static void main(String[] args) {
//         int y = getResult(6);
//         System.out.println(y);
        
//     }
//     public static int getResult(int x){
//         return x+5;
//     }
    
// }
// 2nd method -->
//     public static void main(String[] args) {
//         String y = (String)getResult("Sachin"); // type casting string
//         System.out.println(y);

//     }
//     public static Object getResult (Object x){
//         return x;
//     }
// }
// 3rd method --> 
public static void main(String[] args) {
    String y = getResult("Sachin");
    System.out.println(y);
    
}
public static <T> T getResult(T x){
return x;
   }
}


