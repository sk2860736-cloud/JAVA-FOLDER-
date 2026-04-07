package DAY25_INTERFACES;

public class DAY25_9 {
    public static void main(String[] args) {
        A a = new C();
        a.fun();
    }
    
}
// Priority resolution rule --> 

interface  A {
    default void fun(){
        System.out.println("INSIDE A INTERFACE");
    }
}

class B {
public void fun(){
    System.out.println("INSIDE B CLASS");
}
}
class C extends B implements A{
    // @Override
    // public void fun(){
    //     System.out.println("Inside C class");
    // }
}