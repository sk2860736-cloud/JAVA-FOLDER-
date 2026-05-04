package DAY28_GENERICS;

public class DAY28_03 {
    public static void main(String[] args) {
        // Generic 
        Pair <Integer,String> p1 = new Pair<>(20,"Sachin Gupta");
        
        System.out.println(p1.first+" , "+p1.second);

    }
    
}
class Pair <T,U> {
    T first;
    U second;

    Pair (T first, U second){
        this.first = first;
        this.second = second;

    }
}
