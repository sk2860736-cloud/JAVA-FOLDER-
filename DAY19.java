package DAY19;

public class DAY19 {
//     public static void main(String[] args) {
        // int x = 10;
        // Integer y = x;
        
        // System.out.println(x); // unboxing 
    //    System.out.println(y); // AUTOBOXING
        // Integer y = new Integer(x); // its work in java but not uses this types future in java will finish it 


        // UNBOXING 

        // Integer x = 10;
        //  int y = x;

        // System.out.println(x); 
        // System.out.println(y); // OUTBOXING 
        // int y = x.intValue(); // we use this type also 


//     }


// public static void main(String[] args) {

    // Integer a = 20;
    // Integer b = 30;

    // int sum = a+b;

    // System.out.println(sum);

// null pointer exception 

    // Integer x = null;
    // int y = x;  // not run 

    // System.out.println(y);
    
// }



// public static void main(String[] args) {
//     int x = 100;
//     int y = 100;

//     System.out.println(x == y); // true // premitive 

//     Integer a = 200;
//     Integer b = 200;

//     // System.out.println(a == b); // false it fo;;ow as non premitive data 
//     //a==b  if a and b points same references 

//     System.out.println(a.equals(b)); // true 
// }


// public static void main(String[] args) {

// Integer i = new Integer(10);
// Integer i2 = Integer.valueof(20);

// System.out.println(i.value());
// System.out.println(i2.equals(i2));
    
// }
    
// }
//  final class Integer {
//     private int value; 

//     public Integer (int value){ // CONSTRUCTORS 
//         this.value = value;
//     }
//     public int value(){ // GETTERS / SETTERS 
//         return value;

//     }

//     public static Integer valueof(int x ){
//         return new Integer(x);
//         // give object integer of x 
//     }
//     public boolean equals(Integer y){ 
//         return (this.value == y.value);
//     }



//  ABSTRACT CLASS --> ANY CLASS WHICH CANNOT BE INSTANTIATED .

// 1. CANNOT BE INSATIATED DIRECTLY.
// 2. CAN CONTAIN ABSTRACT METHOD WITHOUT IMPLIMENTATION.
// 3. CAN ALSO CONTAIN NORMALE METHODS. 
// 4. IS MEANT TO BE EXTENDED.



public static void main(String[] args) {
 Animals a1 = new Dog("Bruno");

 a1.sleep();
 a1.makesound();


}

}

abstract class Animals {
    String name ;
    Animals (String name ){
        this.name = name;
    }

    abstract void makesound ();

    void sleep(){
        System.out.println(name + " "+"IS SLEPPING :");
    }

}
class Dog extends Animals {
    Dog (String name ){
        super(name);
    }

 @Override
 void makesound(){
    System.out.println(name + " "+ "IS MAKING BARKING SOUND : ");
 }
    

}



// 1. CAN ABSTRACT CLASSES HAVE CONSTRUCTORS --> YES 
// 2. CAN ABSTRACT CLASSES BE FINAL --> NO 
// 3. CAN ABSTRACT CLASSES HAVE STATIC METHOD OR VARIABLS --> YES
// 4. CAN ABSTRACT CLASSES PRIVATE METHOD --> YES BUT NON ABSTRACT 
// 5. CAN ABSTRACT CLASSES HAVE FINAL MEHTOD --> YES BUT NOT ABSTRACT 
// 6. CAN ABSTRACT CALSSES HAVE NO ABSTRACT METHOD --> YES 




