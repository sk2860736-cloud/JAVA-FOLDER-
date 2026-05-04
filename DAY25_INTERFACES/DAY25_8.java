package DAY25_INTERFACES;

public class DAY25_8 {
    public static void main(String[] args) {
        A a = new D();
        a.fun();

        
    }
    
}
interface A {
 void fun();
}
interface B extends A{
   default void fun(){
    System.out.println("B call");
   }
}
interface  C extends A{
   default void fun(){
    System.out.println("C call");

   } 
}

class D implements B , C{
    @Override
    public void fun(){
        System.out.println("Hello Sufaid Hussain...");
        B.super.fun();
        C.super.fun();
    }
}
