package DAY28_GENERICS;

public class DAY28_02 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10);
        Box<String> b2 = new Box<>("Sachin");
        Box<Boolean> b3 = new Box<>(false);

        System.out.println(b1.getvalue()+5);
        System.out.println(b2.getvalue()+" Gupta");
        System.out.println(b3.getvalue());

        
    }
    
}
// DOWN CASTING -->

class Box <T> {
    private T value;

    Box (T value){
        this.value = value;
    }

    public T getvalue(){
        return this.value;

    }

     public void setvalue( T value ){
        this.value = value;
      }
}