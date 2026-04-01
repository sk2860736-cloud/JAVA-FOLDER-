package DAY15;

public class DAY15 {
//     public static void main(String[] args) {
//         // STATIC KEYWORDS USES -->
//         student s1 = new student ("SACHIN",20,95);
//         student s2 = new student ("SUFAID",22,69);

//         // student.college = "IES UNIVERSITY";

//         System.out.println(s1.name+" , " + s1.age+ " , "+ s1.rollnum+" , " + student.college);
//         System.out.println(s2.name+" , " + s2.age+ " , "+ s2.rollnum+" , " + student.college);

        
//     }
//    static class student {
//     String name;
//     int age;
//     int rollnum;
//     static String college;     // college = "IES UNIVERSITY";
//     // static int grade ;
//     student (String name , int age, int rollnum){
//         this.name = name ;
//         this.age = age;
//         this.rollnum = rollnum;

//     }
//     static{   // static block --> run firstly 

//         student.college = "IES UNIVERSITY";
//     //    grade  = 8;
//     }
//    }

    
// }
// STATIC --> VARIABLES AND METHODS USES BUT NOT USES PARAMETERS AND CLASS, NESTED CLASS USES 



// FINAL KEYWORDS USES --> final double PI = 3.14; , constant --> fix--> lock --> not change 

// public static void main(String[] args) {
// Random r1 = new Random();
// System.out.println(r1.PI);

// final int x;
// x = 5; // one time assigne only 
// System.out.println(x);
    
// }
// static class Random {
//     final double PI; // PI = 3.14 ;
   
//     Random(){
//         PI = 3.14;
//     }

//     // class Random{
//     //     static final double PI;
//     //     static {
//     //         PI = 3.14;
//     //     }
//     // }
// }



// USE OF STRING[] ARGS 
public static void main(String[] args) {
    System.out.println("NUMBER OF ARGUMENTS ARE "+args.length);
    
  for(int i=0; i<args.length; i++){
    System.out.println("arguments are "+ i +" = " + args[i]);

  }

    }}

