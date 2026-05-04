package DAY25_INTERFACES;

public class DAY25_6 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.fun1();

        Vehicle.fun2();

        
    }
    
}
// after java 8 ---> default method , static method 
// from  java 9 ---> private mehtod 

interface Vehicle {
    default void fun1(){
        System.out.println("Hello Sachin Gupta");
        fun3();
    }
    static void fun2(){
        System.out.println("Hello Raj");
    }
    private void fun3(){
        System.out.println("Hello fun3");
    }
}
class Car implements Vehicle{
//    @Override 
//    public void fun1(){
//     System.out.println("Hii Sufaid Hussain ");

//     }
}


