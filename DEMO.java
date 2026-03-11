package LECTURE11;

public class DAY11 {
//     public static void main(String[] args) {
//         // function in java --. block of the code 
//         int i = 5;
//         int j = 5;

//         int result = sum(i,j); // function calling // arguments 

//       System.out.println(result); // print the output 
//     }

// static int sum (int a , int b){ // return type // function name // parameters 
//      int result = (a+b); 
//     return result;
// }

// types of functions 



// public static void main(String[] args) {

//     get();

//     sayhello(" sachin"); // arguments // FUCTION CALL 

//     System.out.println(getNumber());// PRINT AND FUNCTION CALLING 
    
//     System.out.println(multiply(2, 5));// FUNCTION CALL AND PRINT 
    
// }

// static void get (){ // NO IP / NO OP // VOID IS EMPTY KUCH RETRN NHI KRTA HAIN 
//     System.out.println("hello");
//     return;
// }

// static void sayhello(String name ){ // IP BUT NO OP // VOID IS EMPTY KUCH RETURN NHI KARTA HAIN 
//     // NUMBER OF PARAMETERS CAN BE ANYTHINGS 
// System.out.println("hello" + name); 
// return;
// }

// static int getNumber(){ // NO IP BUT OP // NO ANY INPUT BUT OUTPUT 
//     return 10;
// }

// static int multiply(int a , int b){ // IP / OP ---> PARAMETERS 
//     return (a*b);
// }
    


// FUCTION OVERLOADING ---> 
// public static void main(String[] args) {

//     int x = sum(2,3);  // arguments // we can use same function name for same task perform in java 
//     System.out.println(x);

//     int y = sum(4,6); // arguments 
//     System.out.println(y);

//     int z = sum( 4,8); // arguments 
//     System.out.println(z);

//     int d = sum(4,5,6); // arguments 
//     System.out.println(d);

//     int f = sum(8,9); // arguments 
//     System.out.println(f);
  
// }
// static int sum (int a , int b){
//     return (a+b);
// }
// static int sum (int a, int b, int c){
// return (a+b+c);
// }
// static int sum ( double a, double b){ // we can also use differents data types and the perform to sam task 
//     return (int)(a+b);
// }



public static void main(String[] args) {

    // there is compiler erore 
    // because of No parameters . compiles will no t undderstand what i do you can use diffrent function 
  String name = " Sachin";
        int age = 20;

    greet (name , age ); 
     greet (age , name);
}
static void greet(String name , int age){
    System.out.println("hii" + name + " your Age is : "+ age);

}
static void greet(int age, String name){
    System.out.println("hii" + name + " your Age is : "+ age);

}


}

