// package DAY17;

// import DAY16.COLLEGE.student;

// public class DAY16 {
//     // INHERITANCES 
    
//     public static void main(String[] args) {

//         Students s1 = new Students();
//         s1.markattendance();

  
//         EngineeringStudent es = new EngineeringStudent();
//         es.markattendance();
//         es.atttenlab();

        
//     }
// }
// class Students {
//     String name;
//     int age;
//     void markattendance(){
//         System.out.println("ATTENDANCE MAARKED students  ");
//     }

// }
// class EngineeringStudent extends Students{
//     void atttenlab(){
//         System.out.println("ATTEND LAB enginnering students");

//     }
// }


// TYPES OF INHERITANCES --> THERE ARE 4 TYPES OF INHERITANCES BUT IN JAVA USES ONLY THREE 
// 1. SIMPLE INHERITANCE 2. MULTILEVAL INHERITANCE 3. HIRARACHICAL INHERITANCE 4.  MULTIPLE INHERITANCE 

// package DAY17;

// import DAY16.COLLEGE.student;

// public class DAY16 {
//     // SIMPLE INHERITANCES 
    
//     public static void main(String[] args) {

//         Students s1 = new Students();
//         s1.markattendance();

  
//         EngineeringStudent es = new EngineeringStudent();
//         es.markattendance();
//         es.atttenlab();

        
//     }
// }
// class Students { // PARENTS CLASS 
//     String name;
//     int age;
//     void markattendance(){
//         System.out.println("ATTENDANCE MAARKED students  ");
//     }

// }
// class EngineeringStudent extends Students{ // CHILD CLASS 
//     void atttenlab(){
//         System.out.println("ATTEND LAB enginnering students");

//     }
// }


// package DAY17;

// import DAY17.EngineeringStudent.CSEEngineeringStudent;

// public class DAY17 {
//     // MULTILEVAL INHERITANCES 
    
//     public static void main(String[] args) {

//         // Students s1 = new Students();
//         // s1.markattendance();

  
//         EngineeringStudent es = new EngineeringStudent();
//         // es.markattendance();
//         // es.atttenlab();

//         CSEEngineeringStudent s = es.new CSEEngineeringStudent();
//         s.markattendance();
//         s.atttenlab();
//         s.CSElab();
        
//     }
// }
// class Students { // PARENTS CLASS 
//     String name;
//     int age;
//     void markattendance(){
//         System.out.println("ATTENDANCE MAARKED students  ");
//     }

// }
// class EngineeringStudent extends Students{ // CHILD CLASS 
//     void atttenlab(){
//         System.out.println("ATTEND LAB enginnering students");

//     }

//     class CSEEngineeringStudent extends EngineeringStudent  { // child class 
//         void CSElab(){
//             System.out.println("ATTEND CSELAB enginnering students");
//         }
//     }
// }



// package DAY17;

// import DAY17.EngineeringStudent.CSEEngineeringStudent;

// public class DAY17 {
//     // hyrarrical INHERITANCES 
    
//     public static void main(String[] args) {

//         // Students s1 = new Students();
//         // s1.markattendance();

  
//         EngineeringStudent es = new EngineeringStudent();
//         es.markattendance();
//         es.enginneringlab();

//         CSEEngineeringStudent s = es.new CSEEngineeringStudent();
//         s.markattendance();
//         s.CSElab();
        
//     }
// }
// class Students { // PARENTS CLASS 
//     String name;
//     int age;

//     void markattendance(){
//         System.out.println("ATTENDANCE MAARKED students  ");
//     }

// }
// class EngineeringStudent extends Students{ // CHILD CLASS 
//     void enginneringlab(){
//         System.out.println("ATTEND engineering lab students");

//     }

//     class CSEEngineeringStudent extends EngineeringStudent  { // child class 
//         void CSElab(){
//             System.out.println("ATTEND C engineering CSELAB students");
//         }
//     }
// }

// WHY MULTIPLE INHERITACE NOT SUPPORTED IN JAVA // --> BUT YOU CAN USE BY THE HELPP OF INTERFACE 
//       A 
//    /     \
//   B       C  THIS IS THE DIAMONAD RPOBLEM AND DUE TO THSI PROBLEM MULTIPLE INHERITANCE IS NOT SUPPORTED IN JAVA 
//    \     / 
//       D 



// SUPER KEYWORDS --> THIS --> reference of cuttent object 
// SUPER KEYWORDS --> REFERENCE OF PARENT OBJECT 
// USE --> TO ACCESS PARENT CLASS VARIABLE 


package DAY17;



public class DAY17 {
    // hyrarrical INHERITANCES 
    
    public static void main(String[] args) {
        EngineeringStudent s1 = new EngineeringStudent("SACHIN GUPTA ",20, 95, "IES UNIVERSITY");
        s1.print();
        
    }
}

class Students { // PARENTS CLASS 
    String name;
    int age;
    int rollnum;

    Students(String name, int age, int rollnum ){
        this.name = name;
        this.age = age;
        this.rollnum = rollnum;

    }
    void print (){
        System.out.println(name +" , "+ age+" , "+rollnum);

    }
}
class EngineeringStudent extends Students {
    String college;
    EngineeringStudent(String name, int age, int rollnum , String college) {
        super(name, age, rollnum); // calling parent constructor
        this.college = college;

     }
        void print(){
        super.print();
        System.out.println(college);
     }
    }   
