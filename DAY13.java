package DAY13;

public class DAY13 {
    // default constructors -->

//     public static void main(String[] args) {
//         student s1 = new student();

//         System.out.println(s1.name);
//         System.out.println(s1.age);
//         System.out.println(s1.rollnum);
//         System.out.println(s1.college);
//     }
//     static class student{
//    information,data, characters,--> instance variable 
//         String name;
//         int age;
//         int rollnum;
//         String college;
        
//         void markAttendence(){ // behaviour --> fuction --> instance method 

//             System.out.println("attendence marked for student" + name);
//         }

//     }

//  public static void main(String[] args) {
//         student s1 = new student();

//         s1.name = "sachin";
//         s1.age = 20;
//         s1.rollnum = 95;
//         s1.college = "IES UNIVERSITY";

//         s1.markAttendence();

//         System.out.println(s1.name);
//         System.out.println(s1.age);
//         System.out.println(s1.rollnum);
//         System.out.println(s1.college);
        
//     }
//     static class student{
//         String name;
//         int age;
//         int rollnum;
//         String college;
        
//         void markAttendence(){
//             System.out.println("attendence marked for student " + name);
//         }

//     }
// }


// COSTRUCTORS --> TO CREATE AN OBJECT 
// RULE OF CONSTRUCTORS -->

// 1. SAME NAME AS CLASS 
// 2. NO RETURN TYPE NOT EVEN VOID 
// 3. AUTOMATICALY CALLED DURING OBJECT CREATION 
// 4. USED TO INITIALIZED AN OBJECT 
// 5. IT CAN ALSO BE OVERLOADED. 

//  public static void main(String[] args) {
//     student s1 = new student ();
//     System.out.println(s1.name);
    
//     }
//     static class student{
//         String name;
//         int age;
//         int rollnum;
//         String college;

//         student(){
//             name = "sachin";
//             age = 20;
//             rollnum = 95;
//             college = "IES UNIVERSITY";
//         }
        

//     }
// }


// PARAMETERISED CONSTRUCTORS -->

//  public static void main(String[] args) {
//     student s1 = new student("sachin", 20, 95, "Ies university");
//     student s2 = new student ();

//         System.out.println(s1.name);
//         System.out.println(s1.age);
//         System.out.println(s1.rollnum);
//         System.out.println(s1.college);

//         System.out.println(s2.name);
//         System.out.println(s2.age);
//         System.out.println(s2.rollnum);
//         System.out.println(s2.college);

//     }
//     static class student{
//         String name;
//         int age;
//         int rollnum;
//         String college;
    
//     student (String n,int a,int b, String c  ){ // PARAMETERIZED CONSTRUCTORS 
//         name = n;
//         age = a;
//         rollnum = b;
//         college = c;
       

//     }
     
//         student(){   // DEFAULT CONSTRUCTORS 
//         String name;
//         int age;
//         int rollnum;
//         String college;

//         }
   
// }}




// THIS KEYWORDS -->  PREFER VARIABLE SAME NAME JAVA CONVENTION , EASY TO UNDERSTAND 

// public static void main(String[] args) {
// student s1 = new student("SACHIN",20,95,"IES UNIVERSITY");

// System.out.println(s1.name);
// System.out.println(s1.age);
// System.out.println(s1.rollnum);
// System.out.println(s1.college);
    
// }

// static class student{
//     String name ;
//     int age ;
//     int rollnum;
//     String college;

//     student( String name, int age, int rollnum, String college){
//         this.name = name;
//         this.age = age;
//         this.rollnum = rollnum ;
//         this.college = college ;


//     }


// }


// CHAININNG IN CONSTRUCTORS --> CONSTRUCTORS OVERLOADING --> CHAINING 

public static void main(String[] args) {
    student s1 = new student();

    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.rollnum);
    System.out.println(s1.college);
    
}

static class student{ // CONSTRUCTORS CALLING .
    String name ;
    int age ;
    int rollnum;
    String college;

    student(){
        this("SACHIN GUPTA");
        System.out.println("I AM IN FIRST CONSTRUCTORS ");   
    }

    student(String name ){
        this(name , 20);
        System.out.println("I AM IN SECOND CONSTRUCTORS ");   
    }

   student(String name , int aeg){
        this(name , 20, 95);
        System.out.println("I AM IN THIRD CONSTRUCTORS "); 
   }  

   student(String name , int age, int rollnum){
        this(name , 20, 95, "IES UNIVERSITY");
        System.out.println("I AM IN FOURTH CONSTRUCTORS");
   }

    student(String name , int age, int rollnum ,String college){
        this.name = name;
        this.age = age;
        this.rollnum = rollnum ;
        this.college = college ;

        System.out.println("I AM IN THE FIFTH CONSTRUCTORS ");

    }

}


}


 
