// public class practice {

//     public static void main(String[] args) {
//         Direction d = Direction.SOUTH;

//         System.out.println(d.getDegree());
        
//     }
    
// }
// // ENUM --> CLASS 

// enum Direction {  
//     NORTH(0),
//     EAST(90),
//     WEST(270),
//     SOUTH(180);

//     private int degre; 

//    private Direction(int degre){ // create a constructor // you can write private or not write but under java is private constructor automaticaly its not create to object user
//         this.degre = degre;

//     }

//     public int getDegree(){ // getters 
//         return this.degre;

//     }

// }


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




