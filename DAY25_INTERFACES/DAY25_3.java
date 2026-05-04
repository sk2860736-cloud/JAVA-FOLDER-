package DAY25_INTERFACES;

public class DAY25_3 {
    public static void main(String[] args) {
        Mathconstants r1 = new Random();
        r1.fun();

        // System.out.println(Mathconstants.PI_VALUE); WE CAN ALSO USE IN THIS TYPE OF OBJECT
        
    }
    
}
// VARIABLES INSIDE THE INTERFACES  

interface Mathconstants{
    double PI_VALUE = 3.14;
    int VALUE = 10;

    void fun();
}
class Random implements Mathconstants{
    @Override
    public void fun(){
        System.out.println(PI_VALUE);
        System.out.println(VALUE);
    }
}