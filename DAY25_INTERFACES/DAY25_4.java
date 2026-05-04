package DAY25_INTERFACES;

public class DAY25_4 {
    public static void main(String[] args) {
        A a = new c();
        a.fun1();

        B b= new c();
        b.fun2();
    

        
    }
}
    // MULTIPLE INHERITANCES 

 interface A {
    void fun1();

 }
 interface B {
    void fun2();

 }
 class c implements A , B{
    @Override
    public void fun1(){
        System.out.println("HELLO SACHIN");
    }
    @Override
    public void fun2(){
        System.out.println("Hii SUFAID ");
    }
 }
 
