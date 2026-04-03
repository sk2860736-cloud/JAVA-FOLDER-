package DAY24_ENUMS;

public class DAY24_4 {
    public static void main(String[] args) {
        Direction d = Direction.EAST;
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
