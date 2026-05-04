public class enums {
    public static void main(String[] args) {
        Direction d = Direction.SOUTH;
        d.move();
        
    }
    
}
enum Direction {  
    NORTH{
    @Override
       public void move(){
            System.out.println("move up ( y+1 ) ");
        }
    },
    EAST {
    @Override
       public void move(){
            System.out.println("move down ( y-1) ");
       }
        },
    WEST{
    @Override
       public void move(){
            System.out.println("move Right ( x+1 ) ");
       }
        },
    SOUTH{
    @Override
       public void move(){
            System.out.println("move left ( y-1 ) ");
       }
        };

    public abstract void move();

}
    

