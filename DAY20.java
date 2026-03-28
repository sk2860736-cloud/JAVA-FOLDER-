package DAY20;

// public class DAY20 {
//     public static void main(String[] args) {
//         Outer.Inner inner = new Outer.Inner();
//         inner.fun1();

        
//     }
    
// }
// class Outer {
//     // static nested class 

//     static class Inner{
//         // static int x;

//         void fun1(){
//             System.out.println("HELLO SACHIN GUPTA : ");
//         }

//     }
// }


    // public class DAY20 {
    //     public static void main(String[] args) {
    //         Outer outer = new Outer();// outer class object 
    //         Outer.Inner inner = new Outer.Inner(outer); // innner class object 
    //         inner.fun1(outer);
    //     }
    // }


    // class Outer {

    //     static int x = 4;
    //     int y = 5;

    //     static class Inner {
    //         Outer outer; // constructor 
    //         Inner(Outer outer){
    //             this.outer = outer;

    //         }

    //         void fun1 (Outer outer ){
    //             System.out.println(x);
    //             System.out.println(outer.y);

    //         }

    //     }
    // }

        // public class DAY20 {
        //     public static void main(String[] args) {
        //       BankAccount account = new BankAccount();

        //       // Calculate interest
        //       double interest = account.computeInterest(10000);

        //       System.out.println("Yearly Interest: " + interest);
          
        //     }
        // }
        // class BankAccount { // outer class 

        //    static private class Interestcalculculator{
        //         static double calculateyearly(double principle, double rate){
        //         return principle * rate ;

                
        //     }}
        //     public double computeInterest (double principle){
        //         return Interestcalculculator.calculateyearly(principle,0.09);
        //     }}




    /*
          *  USE CASE OF STAIC NESTED CLASSES 
        1. AS HELPER CLASS FOR ANY OUTER CLASS 
        2. BUILDER DESIGN PATTERN 
        3. IF YOU WANT TO HAVE STATIC METHODS INSIDE  A NESTED CLASS. 
        4. REQUEST / RESPONCE DTO 



        KEY PROPERTIES--> 

        1. DOES NOT NEED AN INSTANCE OF OUTER CLASSES 
        2. CLASS CAN BE INTANTAITED LIKE NORMLE CLASS.
        3. CAN ACCSES NON STATIC MEMBER BY HAVING A REFERENCES OF OUTER CLASS
        4. IT IS JUST LIKE NORMLE CLASS AND CAN  DO ANYTHINGS ON OUTER CLASS DOES . 
        5. CLASS ACCES ONLY STATIC MEMBER BY HAVING OUTER CLASSS . 
    
    */

    //  INNNER CLASS --> NESTED CLASS NOT USES STATIC CLASS ONLY USE NON STSTIC CLASS IN JAVAV 16 
        
public class DAY20{
//     public static void main(String[] args) {
//         // SPECIAL USE CASE IN JAVA SYNTAX 
//         Outer.Inner inner = new Outer().new Inner();
//         inner.fun();
       
//     }
// }

// class Outer {

//     class Inner {
//         void fun (){
//             System.out.println("HELLO SACHIN GUPTA ");


//     }
//     }
public static void main(String[] args) {
   Outer outer = new Outer();
   Outer.Inner inner = outer.new Inner ();

   inner.fun();

//  System.out.println(outer.x);
//  System.out.println(inner.x);

  
// }
// }

// class Outer {
//     int x = 10;


//     class Inner{
//         int x = 20;
        

        }}
    class Outer {
        int x = 10;
        class Inner {
            int x = 20;
            void fun(){
                System.out.println(x);
                // System.out.println(Outer.this.x);
            }
        }
    }

//     static void fun2(){
//     System.out.println("HELLO SACHIN GUPTA ");// you can use static in this type but old java not allow
// }






