package DAY28_GENERICS;

public class DAY28_01 {
    public static void main(String[] args) {
        Box b1 = new Box(10);
        Box b2 = new Box("Sachin");
        Box b3 = new Box(false);

        Integer x = (Integer)b1.getvalue();
        String s = (String)b2.getvalue();
        Boolean b = (Boolean)b3.getvalue();

        System.out.println(x+5);
        System.out.println(s+ " Gupta");
        System.out.println(b);

        
    }
    
}
// DOWN CASTING -->

class Box {
    private Object value;

    Box (Object value){
        this.value = value;
    }

    public Object getvalue(){
        return this.value;

    }

    // public void setvalue(){
    //     this.value = value;
    // }
}

// LImitation of using object as universal type.
// wrong inforrmation is lost 
// casting became neccesory to runtime . 
// many errore shift to runtime. 


