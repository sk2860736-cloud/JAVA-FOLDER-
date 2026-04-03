package DAY25_INTERFACES;

public class DAY25_1 {
    public static void main(String[] args) {
        Thar c = new Blackthar();
         c.Drive();
        
    }
    
}
interface Car {
    void Drive();
   
}

abstract class Thar implements Car{
   abstract public void Drive();

}

class Blackthar extends Thar {
    public void Drive(){
        System.out.println("black thar is driving ");
    }
}