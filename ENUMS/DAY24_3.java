package ENUMS;

public class DAY24_3 {
    public static void main(String[] args) {
        Direction d = Direction.SOUTH;

        System.out.println(d.getDegree());
        
    }
    
}
// ENUM --> CLASS 

enum Direction {  
    NORTH(0),
    EAST(90),
    WEST(270),
    SOUTH(180);

    private int degre; 

    Direction(int degre){ // create a constructor 
        this.degre = degre;

    }

    public int getDegree(){ // getters 
        return this.degre;

    }

}
