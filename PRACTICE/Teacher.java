package PRACTICE;

public class Teacher {

 private String name;
   private  int age;
   private  String subject;
   private String college;
    
   public Teacher(String name, int age, String subject, String college){
    this.name = name ;
    this.age = age;
    this.subject = subject;
    this.college = college;

   }
   public void display(){
    System.out.println("TEACHER NAME: " + name );
    System.out.println("TEACHER age: " + age );
    System.out.println("TEACHER TEACHING SUBJECT:"  + subject ); 
    System.out.println("TEACHER college: " + college );
   }
}
