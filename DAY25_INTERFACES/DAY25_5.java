package DAY25_INTERFACES;

public class DAY25_5 {
    public static void main(String[] args) {
        
    }
    
}
// interface inheritances 
interface Animal{
    void fun1();
}
interface Dog extends Animal{
    void fun2();

}
class Streetdog implements Dog{
    @Override
    public void fun1(){
        System.out.println("barking ");
    }
     @Override
    public void fun2(){
        System.out.println("easating");
    }
}