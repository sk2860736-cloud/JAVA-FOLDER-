package DAY25_INTERFACES;

public class DAY25_7 {
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
    public void fun(){
        System.out.println("Hello Sufaid Hussain...");
    }
}