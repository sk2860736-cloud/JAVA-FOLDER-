package DAY14;

public class DAY14 {
//     public static void main(String[] args) {

//         // call by value 

//         int x = 4;
//         int y = 5;

//         System.out.println(x +" , "+ y);

//         addTen(x, y);
//         System.out.println(x +" , "+ y);
        
//     }
//    static void addTen(int x , int y){
//     x = x + 10;
//     y = y + 10;


//     }
// }

// call by Reference --> there is no call by referefce in java .
public static void main(String[] args) {
    // call by reference 

    Random r1 = new Random(4,5);
    System.out.println(r1.x + " , " + r1.y);

    addTen(r1);
     System.out.println(r1.x + " , " + r1.y);
}
static void addTen (Random r ){
    r.x = r.x+10;
    r.y = r.y+10;
}
static class Random {
    int x ;
    int y ;

    Random(int x, int y){
        this.x = x;
        this.y = y;
    }
}

}

// C/C++ BOTH USES AND CALL LIKE --> CALL BY VALUE AND CALL BY REFERENCE WORKS IN A C OR CPP BUT
// JAVA --> ONLY FOR CALL BY VALUE WORKS NOT WORKS CALL BY REFERENCE 
