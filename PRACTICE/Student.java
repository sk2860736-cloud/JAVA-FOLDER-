package PRACTICE;

public class Student {

   private String name;
   private  int age;
   private  int rollnum;
   private String college;
    
   public Student(String name, int age, int rollnum, String college){
    this.name = name ;
    this.age=age;
    this.rollnum = rollnum;
    this.college = college;

   }
   public void display(){
    System.out.println("STUDENT NAME: " + name );
    System.out.println("STUDENT age: " + age );
    System.out.println("STUDENT rollnum:"  + rollnum ); 
    System.out.println("STUDENT college: " + college );
   }

}
