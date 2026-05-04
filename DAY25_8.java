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
    void fun();  
}
interface  C extends A{
    void fun();  
}

class D implements B , C{
    @Override
    public void fun(){
        System.out.println("Hello Sufaid Hussain...");
    }
}

// public class DAY25_8 {
//     public static void main(String[] args) {
//         A a = new D();
//         a.fun();

        
//     }
    
// // }
// // interface A {
// //  void fun();
// // }
// // interface B extends A{
// //    default void fun(){
// //     System.out.println("B call");
// //    }
// // }
// // interface  C extends A{
// //    default void fun(){
// //     System.out.println("C call");

// //    } 
// // }

// // class D implements B , C{
// //     @Override
// //     public void fun(){
// //         System.out.println("Hello Sufaid Hussain...");
// //         B.super.fun();
// //         C.super.fun();
// //     }
// // }
// public class DAY25_9 {
//     public static void main(String[] args) {
//         A a = new C();
//         a.fun();
//     }
    
// }
// interface  A {
//     default void fun(){
//         System.out.println("INSIDE A INTERFACE");
//     }
// }

// class B {
// public void fun(){
//     System.out.println("INSIDE B CLASS");
// }
// }
// class C extends B implements A{
//     // @Override
//     // public void fun(){
//     //     System.out.println("Inside C class");
//     // }
// }