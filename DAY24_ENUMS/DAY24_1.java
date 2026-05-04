package DAY24_ENUMS;

// public class DAY24 {
//     public static void main(String[] args) {

        // WIHTOUT ENUMS 

        // int status = PaymentStatus.SUCCESS;
        // System.out.println(status);

        // int status2 = 100;
        // System.out.println(status2); //  compile time eroore, not type safty. 

        // if (status == 1){
        //     System.out.println(true); // POOR READABILITY 
        // }

        // if (status == Role.Admin){
        //     System.out.println(true); // no grouping of repetative antity

        // }


        
//     }
    
// }

// class PaymentStatus{
//     public static final int SUCCESS = 1;
//     public static final int FAILED = 2;
//     public static final int PROCESS = 3;

// }

// class Role {
//     public static final String Admin = "user1";
//     public static final String Manafer = "user2";

// }

/* 
ENUMS --> FULLFORM ENUMERATION --> 
          ENUMS IS PREDEFINE SET OF CONSTANTS 

          PROBLEMS --> 
          1. TYPE SAFTY 
          2. POOR REDABILITY 
          3. NO GROUPING REPEATATIVE ANTITY 

 */   
 
public class DAY24_1{
    public static void main(String[] args) {
        PaymentStatus d = PaymentStatus.SUCCESS;
        System.out.println(d);

        // PaymentStatus d = 100;  // runtime errore,  type safty 
        
    }
}
enum PaymentStatus{
                      // CONSTANTS 
    SUCCESS,
    FAILED,
    PROCESS;
}



