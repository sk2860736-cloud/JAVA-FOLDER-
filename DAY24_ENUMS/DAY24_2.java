package DAY24_ENUMS;

public class DAY24_2 {
    public static void main(String[] args) {
        // UNDERSATNDING ENUMS --> // ENUMS IS NOTHING BUT ITS A CLASS IT TRANSLATE INTO CLASS DIRECTION 
        // JAVA.LANG.ENUM OVERRIDE 
        // 1. CLASS DIRECTION EXTENDS ENUMS <DIRECTION> 
        // 2. EACH CONSTANTS ARE STATIC AND FINAL 
        // 3. TYPE DIRECTION OBJECT OF A CLASS 

        Direction d1 = Direction.NORTH;
        // Direction d2 = Direction.SOUTH;
        Direction d3 = Direction.NORTH;
        Direction d4 = Direction.EAST;

        System.out.println(d1==d3);
        System.out.println(d4);


        
    }
    
}
enum Direction {  
    NORTH,
    EAST,
    WEST,
    SOUTH;
}
