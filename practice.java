public class practice {

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

   private Direction(int degre){ // create a constructor // you can write private or not write but under java is private constructor automaticaly its not create to object user
        this.degre = degre;

    }

    public int getDegree(){ // getters 
        return this.degre;

    }

}

    

