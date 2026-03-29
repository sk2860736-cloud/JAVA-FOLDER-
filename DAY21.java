package DAY21;

import java.util.Scanner;

// import java.io.BufferedReader;

// public class DAY21 {
//     public static void main(String[] args) {
//         system s = new system();
//         s.printstream();
//     }
    
// }
// class system {
//     static void printstream(){
//         System.out.println("Hello");
//         System.err.println("bye"); // invailed/ errore use err uses 
//     }


// public static void main(String[] args) {
//     int age = +-3;

//     if (age<0){
//         System.err.println("ENVAILED AEG "); // ENVAILED ERORRE 
//     }
// }

//  }

/*
   INPUT --> JSVS --> CONSOLE --> I/O --> SEVER LANG 
                                  // NETWORK, JSON, GUI, (FORM)

*/
// import java.io.IOException;
// public class DAY21 {
//     public static void main(String[] args)throws IOException {

//         int x = System.in.read();
//         System.out.println((char)x);
        
//     }
// }

// only string data store given and only one 1 byte as given sachin 

// for solution is using Loop 
//         public static void main(String[] args)throws IOException {
//             String name = "";
//             int c;
//              while ((c = System.in.read()) != '\n') {
//             name += (char) c;
//             System.out.println("input name : "+name);
            
//             }
//         }

// }

/*   READER (ABSTRACT){ -> READ CHUNK OF CHARACTER FROM OS BUFFER 
                        1. STORE IT IN MEMORY 
                        2. GIVE THEM TO PROGRAM WHEN REQUERED 

                        BYTE STREAM --> CHARACTERS STREAMS 

  1. BUFFER READER 
  2. NINPUTSTREAM READER                     // CONSOLE 
  3. FILE READER
}
  STREAM OF CHARACTER --> SACHIN (RIGHT)
 */

//   import java.io.IOException;
// // import java.io.InputStream;
// import java.io.InputStreamReader;
// public class DAY21 {
//     public static void main(String[] args)throws IOException {

//         // InputStreamReader isr = new InputStreamReader(System.in);
//         // BufferedReader br = new BufferedReader(isr);

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         String name = br.readLine();
//         System.out.println("input name : "+name);
        
//     }
// }


/*   BUUFFERD READER AS FOLLOWS STEP

    1. SACHIN --> I/O 
    2. OS BUFFER (ASCII VALUE STORE LETTER WISE )
    3. SYSTEM.IN(INPUTSTREAM) RECIEVE BYTES .
    4. INPUTSTREAMREADER --> STREAM OF BYTES INTO STREAM OF CHARACTERS 
    5. 'S','A','C','H','I','N','\N'
    6. BUFFERED READER --> READLINE --> SACHIN --> NAME 
 */


    /*   LIMITATION OF BUFFERED READER --> 

        1. STRING S = BR,READ();
        2. INT I = INTEGER.PARSE.INT(S);
        3. SYSTEM.OUT.PRINTLN(I) ;
        // 25 
    
    */

        /*  SCANNER --> JAVA -- 1.5 
           SCANNER 1. SIMPLIFY (INPUT)
                   2. INT, DOUBLE ,  STRING ,  
                    JAVA.IO(X) PACKAGE 
                    JAVA.UTIL
         */
 // SCANNER CLASS 

public class DAY21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // next()sachin gupta not print one word print sachin 
        System.out.println("input name : " + name );

        sc.close();
        
    }
    
}

/*  SCANNER READABLE / INTERFACE 
SCANNER --> TOP PRIORITY 

INPUTSTREAM(SYSTEM.IN)
INPUTSTREAMREADER
BUFFER READER 
 */


/* CREATING SCANNER 

KEYBOARD SCANNER SC = NEW SCANNER (SYSTEM.IN) // CONSTRUCTOR 

SCANNER SC = NEW SCANNER ("SAMPLE FILE ");

STRING = NEW SCANNER ("10,20,30")
SC.READER();

SCANNNER --> TAKENIZATION HELLO - I - AM - SACHIN // SPACES SEEN TO PRINT 

METHOD --> 
1. NEXT();
2. NEXTLINE();
3. NEXTINT();
4.
5.

SCANNER SLOW COMPARE TO BUFERED READER 

SCANNER SLOWER                    BUFFERED READER FASTER 

TOKENIZATION                       X NOT FOLLOW 
REGULAIZATION                      X NOT FOLLOW 
TYPE CONVERSION                    X NOT FOLLOW      

 */


