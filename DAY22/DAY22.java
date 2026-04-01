// package DAY22;

// public class DAY22 {
//     public static void main(String[] args) {
//         Student s1 = new Student(20, "SACHIN GU[TA");

//         System.out.println(s1.getname());
//         System.out.println(s1.getage());
    
//     }
    
// }
// // IMMUTABLE CLASS 
// /* RULE OF IMMUTABLE OBJECT 
//    1. MARK MY CLASS AS FINAL 
//    2. MARK MY VARIABLE AS PRIVATE AND FINAL 
//    3. NO SETTERS 
//    4.DEFENSIVE COPY IN CONSTRUCTOR / GIVEN 
//  */


// final class Student {
//     private final String name;
//     private final int age;

//     Student (int age, String name ){
//         this.name = name;
//         this.age = age;
//     }

//       // getters

//    public int getage(){
//     return this.age;
//    }

//     public String getname(){
//     return this.name;
//    }
// }

// package DAY22;

// public class DAY22 {
//     public static void main(String[] args) {

//         College college = new College("IES UNIVERSITY", "BHOPAL");
//         Student s1 = new Student(20,"SACHIN GUPTA",college);

//         System.out.println(s1.getcollege().name);
//         s1.getcollege().name = "IIT BOMBAY";

//         System.out.println(s1.getcollege().name);

    
//     }
    
// }
// // (NOT PURELY INMUTABLE OBJECT) 

// final class Student { // immutable class 
//     private final String name;
//     private final int age;
//     private College college;

//     Student (int age, String name, College college){
//         this.name = name;
//         this.age = age;
//         this.college = college;
//     }

//       // getters

//    public int getage(){
//     return this.age;
//    }

//     public String getname(){
//     return this.name;
//    }

//    public College getcollege(){
//     return this.college;
//    }
// }
// class College { // mutable class 
//     String name;
//     String address;
  
//     College(String name , String address){
//         this.name = name;
//         this.address = address;
//     }
// }

package DAY22;

public class DAY22 {
    public static void main(String[] args) {

        College college = new College("IES UNIVERSITY", "BHOPAL");
        Student s1 = new Student(20,"SACHIN GUPTA",college);

        System.out.println(s1.getcollege().name);
        s1.getcollege().name = "IIT BOMBAY";// you can write the but you cannot changed it 

        System.out.println(s1.getcollege().name);
      
    
    }
    
}
// (PURELY INMUTABLE ) --> DEFENSIVE COPY NON PREMITIVE 
// STRING BY DEFAULT IMMUTABLE 

final class Student {            // immutable class 
    private final String name;
    private final int age;
    private College college;

    Student (int age, String name, College college){
        this.name = name;
        this.age = age;
        this.college = new College(college.name,college.address);
    }

      // getters

   public int getage(){
    return this.age;
   }

    public String getname(){
    return this.name;
   }

   public College getcollege(){
    return new College(this.college.name ,this.college.address);
   }
}
class College {                 // mutable class 
    String name;
    String address;
  
    College(String name , String address){
        this.name = name;
        this.address = address;
    }
} // DEEP COPY --> NON PRIMITIVE DIFFERENT OBJECT CREATED 

// THREADS --> RACE CONDITION .