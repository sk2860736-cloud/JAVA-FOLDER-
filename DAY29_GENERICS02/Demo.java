package DAY29_GENERICS02;

// import java.util.ArrayList;
// import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // invariant in generics 
        // Animals animal = new Dog();
        // Dog dog = new Dog();

        // animal.eat();
        // animal.walk();
        // dog.bark();

        // List<Dog> dogs = new ArrayList<>(10); 
        // List<Animals> = new Animals = dog; // Run time errore .

        Dog[] dogs = new Dog[10];
        Animals[] animals = dogs;  
        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = new Dog();

        // animals[4] = new Animals(); // compile time errore. 

        /* Simple Rule to Remember

    Arrays = unsafe (runtime error possible)
    Generics = safe (compile-time error)
         */

        for (Animals animals2: animals){
            if(animals2 == null){
                continue;
            }
             animals2.eat();
           
        }
    

        
    }
    
}
class Animals {
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("Walking");
    }
}
class Dog extends Animals{
    void bark(){
        System.out.println("The dog is barking. ");
    }
}
