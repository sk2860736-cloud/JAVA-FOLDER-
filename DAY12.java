package LECTURE12;

public class DAY12 {
    public static void main(String[] args) {

        student s1 = new student();
        student s2 = new student();

        s1.name = "Sachin";
        s1.age = 20;
        s1.rollNUm = 95;
        s1.college = "ies university";

        s2.name = "Raj";
        s2.age = 20;
        s2.rollNUm = 95;
        s2.college = "ies university";
      
        s1.marksAttendence();
        s2.marksAttendence();

        s1.print();
        s2.print();
        
    }
    static class student {
        String name;
        int rollNUm;
        int age;
        String college;
        
        void marksAttendence(){
            System.out.println("attendence marked by " + name);
        }

        void print(){
            System.out.println(name + " ," + age + " ," + rollNUm + " ,"+ college + " ,");
        }
    
        
    }
    
}

// JAVA IS THE ALMOST COMPLETE OBJECT ORIENTED PROGRAMING LANGUAGE !

