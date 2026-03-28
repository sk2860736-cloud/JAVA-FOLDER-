package DAY20;

// public class DAY20_2ND {
//     public static void main(String[] args) {
//         Outer outer = new Outer();
//         outer.greet();
        
//     }
    
// }
// // LOCAL CLASS 
// class Outer {
//     void greet(){
//         class Local {
//             void sayhello(){
//                 System.out.println("HELLO SACHINN GUPTA");
//             }
//         }
//          Local local = new Local ();
//          local.sayhello();
//     }

 
// }
// public class DAY20_2ND {
//     public static void main(String[] args) {
//         Outer outer = new Outer();
//         outer.greet();
//     }
// }

// // LOCAL CLASS
// class Outer {
//     void greet() {

//         class Local {   // ✔ Naming convention fixed

//             void sayHello() {   // ✔ Method naming fixed
//                 System.out.println("HELLO SACHIN GUPTA");
//             }
//         }

//         Local obj = new Local();  // ✔ Object creation
//         obj.sayHello();           // ✔ Method call
//     }
// }


// you can uses 
// constructor 
// method
// if 
// loop
// static block 


// ANONYMOUS CLASS 
 public class DAY20_2ND {
    public static void main(String[] args) {

        // Person p1 = new Person();
        // p1.introduce();

        // Person p2 = new Guest();
        // p2.introduce();

        Person p3 = new Person(){ // particular only for one time uses 
            String name = "SACHIN";
            void introduce(){

                greet();

                System.out.println("HII I AM "+name);
            }
           void greet(){
                System.out.println("hello");
            }
        };

        p3.introduce();
  
        
    }
 }
 class Person {
    void introduce(){
        System.out.println("HII I AM A PERSON : ");
    }
 }
//  class Guest extends Person{
//     void introduce(){
//         System.out.println("HII I AM A GUEST : ");

//     }
//  }


// you can not use constructor in anonymous class 
// inner class rule also follow but not follow constructor 

// 1. nested claas 
// 2. anonymous class --> lembdas 
// 3. innner class 
// 4. local class 


