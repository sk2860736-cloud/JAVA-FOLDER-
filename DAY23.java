package DAY23;

// OBJECTS CLASS  --> PARENT CLASS --> JAVA.LANG --> EVERY OBJECT CLASS INHERITS FROM OBJECT CLASS
// TYPES --> 1. TOSTRING 2. EQUALS 3. HASHCODE 4.GETCLASS  

// public class DAY23 {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "SACHIN GUPTA";
//         s1.age = 20;

//         System.out.println(s1);
//     }
    
// }
// // to String() --> covert anything to String . 

// class Student {
//     String name;
//     int age;

// @Override
// public String toString(){
//     return (name + " , " + age);
// }


// }


// EQUALS --> COMPARE TWO OBJECTS AND RETRURN TRUE OR FALSE .

// public class DAY23 {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "SACHIN GUPTA";
//         s1.age = 20;

//         Student s2 = new Student();
//         s2.name = "SACHIN GUPTA";
//         s2.age = 20;

//         System.out.println(s1.equals(s2)); // s1 == s2 
        
//     }

// }
// class Student extends Object { // extends object 
//     String name;
//     int age;

//     @Override
//     public boolean equals(Object obj){
//         if (this == obj){
//             return true;
//         }
//         if (obj == null){
//             return false;
//         }
        // CHECK IF BOTH CLASS ARE OF TYPE STUDENT 
        // IF NOT CHECKED --> CLASSCASTEXCEPTIONS .

//     if (obj.getClass() != this.getClass()){
//         return false;

//     }
//     Student s = (Student)obj;
//     return (this.name == s.name && this.age == s.age);
    
//     }
// }

// HASH CODE --> RETURN AN INTEGER OF AN OBJECT 
// RULE --> IF TWO OBJECT ARE EQUAL THAN THERE HASHCODE BE EQUAL 

// import java.util.Objects;

// public class DAY23 {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "SACHIN GUPTA";
//         s1.age = 20;

//         Student s2 = new Student();
//         s2.name = "SACHIN GUPTA";
//         s2.age = 20;

//         System.out.println(s1.equals(s2)); // s1 == s2 
//         System.out.println(s1.hashCode() == s2.hashCode());
        
//     }

// }
// class Student extends Object { // extends object 
//     String name;
//     int age;

//     @Override
//     public boolean equals(Object obj){
//         if (this == obj){
//             return true;
//         }
//         if (obj == null){
//             return false;
//         }
    
//     if (obj.getClass() != this.getClass()){
//         return false;

//     }
//     Student s = (Student)obj;
//     return (this.name == s.name && this.age == s.age);
// }
//     @Override
//     public int hashCode(){
//     return Objects.hash(name,age);
    
//     }
// }


/*  GET CLASS --> RETURN CLASS OF AN OBJECT 

INSTANCE OF OPERATOR --> CHECK IF AN OBJECT IS INSTANCE OF A OBJECT OR ANY OF ITS SUBCLASS.


 */

// public class DAY23 { 
//     public static void main(String[] args) {
//         Animal a = new Animal();
//         Dog d = new Dog();

//         System.out.println(a.getClass().getName()); //  class name given 
//         System.out.println(d.getClass().getName()); // class name given 

//         System.out.println(a instanceof Animal); // True 
//         System.out.println(d instanceof Dog);   // True 
      
//     }
// } 

// class Animal { // class name 

// }

// class Dog extends Animal { // extend to animal class 

// }

// CLONE() --> CREATE COPY OF AN OBJECT / -- METHOD NOT CALL DIRECTLY 

import java.util.Objects;

public class DAY23 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student();
        s1.name = "SACHIN GUPTA";
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "SACHIN GUPTA";
        s2.age = 20;

        // System.out.println(s1.equals(s2)); // s1 == s2 
        // System.out.println(s1.hashCode() == s2.hashCode());

        Student s3 = (Student) s1.clone(); // TYPE CASTE STUDENT TO S1.CLONE 
        System.out.println(s3.name);
        System.out.println(s3.age);
        
    }

}
class Student extends Object implements Cloneable{ // extends object 
    String name;
    int age;

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
    
    if (obj.getClass() != this.getClass()){
        return false;

    }
    Student s = (Student)obj;
    return (this.name == s.name && this.age == s.age);
}
    @Override
    public int hashCode(){
    return Objects.hash(name,age);
    
    }
   protected Object clone() throws CloneNotSupportedException{ 
    return super.clone();
   }
}
  // NOT EVERY OBJECT SHOULD BE CLONABLE . DATABASE , THREADS 
  // INTERFACES CLONABLE BODY IS EMPTY --> MAKER INTERFACES 


  /*  FINALIZE() --> GARBAGE COLLECTION --> DEPRECATEAD -->: UNPREDICTABLE, UNSAFE, UNREVIVAL 
  
   */
