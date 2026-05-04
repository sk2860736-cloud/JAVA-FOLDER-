package ENUMS;

public class DAY24_5{
    public static void main(String[] args) {

     /*
     ENUMS --> EXISTING FUNCTIONALITY 
     ENUM DIRECTIONN --> JAVA.LANG

     IN COMPILER GENERATED 
     1. VALUES() --> WE CAN ITERATE IN THIS ENUM .
     2. VALUEOF()--> CONVERT A STRING IN ANY ENUM CONSTANTS 

     IN ENUM CALSS 
     3. NAME() --> NOT OVERRIDE , TOSTRING --> OVERRIDE AND , ALSO D DIRECTLY YOU CAN ACCESS BECAUSE OF TOSTING IN JAVA 
     4. ORDIANL()--> ITS RETURN INDEXING OF ARRAYS, CONSATNT 0, 1, 2, 3...

     */  
        
        Direction[] directions = Direction.values();   // value()
        for (Direction d : directions){ // FOR EACH 
            System.out.println(d.name());
        }

        Direction d = Direction.valueOf("EAST");   // valueof()
        System.out.println(d);

        Direction d1 = Direction.NORTH;
        System.out.println(d1.name());    // name()

        System.out.println(Direction.NORTH.ordinal());   // ordinal() 

        
    }
    
}

enum Direction{
    NORTH, 
    SOUTH, 
    EAST, 
    WEST;
}
