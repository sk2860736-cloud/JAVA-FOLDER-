package DAY18;

// import DAY18.DAY18.Car;

// public class DAY18 {
//     public static void main(String[] args) {
//         Car Car1 = new Deselcar();
        
//         Car1.start();
//         Car1.accelerate();
//         Car1.breake();

//         System.out.println("-------------------------------");

//         Car Car2 = new Fuelcar();

//         Car2.start();
//         Car2.accelerate();
//         Car2.breake();

//         System.out.println("-------------------------------");


//         Car Car3 = new Electriccar();

//         Car3.start();
//         Car3.accelerate();
//         Car3.breake();
        
//     }
// }

//    abstract class Car {
//         void start (){
//             System.out.println("CAR IS SATRTING ");
//         }
//       abstract void accelerate();
//       abstract void breake ();     
        
//     }
    
//     class Fuelcar extends Car{
//     @Override
//        void accelerate(){
//             System.out.println("FUEL CAR IS ACCELARAING ");
//         }
//         @Override
//             void breake() {
//                 System.out.println("THE CAR IS STOPPING ");
//             }
//     }
//     class Deselcar extends Car{
//     @Override
//        void accelerate(){
//             System.out.println("FUEL CAR IS ACCELARAING ");
//         }
//         @Override
//             void breake() {
//                 System.out.println("THE CAR IS STOPPING ");
//             }
//     }
//     class Electriccar extends Car{
//     @Override
//        void accelerate(){
//             System.out.println("FUEL CAR IS ACCELARAING ");
//         }
//         @Override
//             void breake() {
//                 System.out.println("THE CAR IS STOPPING ");
//             }
    
// }


// INTERFACES --> ABSTRACT CLASS TO SIMILER , INTERFACE --> OBJECT (NOT FOLLOW )


public class DAY18 {
    public static void main(String[] args) {

        Car c1 = new FuelCar();   // object
        c1.start();
        c1.accelerate();
        c1.stop();

        System.out.println("------------------------------");
        
        Car c2 = new ElectricCar();
        c2.start();
        c2.accelerate();
        c2.stop();

    }
}

// Interface
interface Car {
    void start();
    void accelerate();
    void stop();
}

// Fuel Car class
class FuelCar implements Car {

    @Override
    public void start() {
        System.out.println("Fuel car has started");
    }

    @Override
    public void accelerate() {
        System.out.println("Fuel car has accelerated");
    }

    @Override
    public void stop() {
        System.out.println("Fuel car has stopped");
    }
}

// Electric Car class
class ElectricCar implements Car {

    @Override
    public void start() {
        System.out.println("Electric car has started");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric car has accelerated");
    }

    @Override
    public void stop() {
        System.out.println("Electric car has stopped");
    }

}

// POLIMORPHISM --> MANY FORMS --> SAME OBJECT BEHAVE RESPONCE DIFFERENTLY ON SAME COMMAND IF OBE PARAMETER IS CHANGED 
// 1. COMPILE TIME POLYMORPHISM / METHOD OVERLOADING 2. RUNTIME POLYMORPHISM / METHOD OVERRIDING 


// STATIC , FINAL , PRIVATE ==> THEY ARE NOT OVERRIDE 

// STATIC --> they belogs to class and not override to object 
// private --> private method cannot be override 
// final --> final mehtod cannot be override 

// public static void main(String[] args) {
//     A a = new B();
//     a.fun1(); // because of static belogs to class not to object 
    
// }

//  }
// class A{
//     static void fun1(){
//         System.out.println("SACHIN");
//     }

// }

//  class B extends A {

//     static void fun1(){
//      System.out.println("GUPTA");
//     }
    
// }
// class c {
//    private void fun2(){ // you can not create object because of it is a private method AND METHOD CANNOT BE OVERRIDE 
//         System.out.println("SUFAID");
//  }
