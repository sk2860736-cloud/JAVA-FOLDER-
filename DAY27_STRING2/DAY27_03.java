package DAY27_STRING2;

public class DAY27_03 {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Sachin");
        // System.out.println(sb.capacity()); // 22  

        // StringBuffer sbc = new StringBuffer();
        // sbc.append("Sachin");
        // sbc.append("Gupta");
        // sbc.append("IS Strong");
        // System.out.println(sbc.capacity()); // 34

        StringBuilder sb = new StringBuilder("SachinGupta");
        // sb.insert(6, " ");
        // System.out.println(sb); // Sachin Gupta 

        // sb.delete(7, 12);
        // System.out.println(sb); // Sachin

        sb.replace(0, 12, "Sufaid Hussain");
        System.out.println(sb); // Sufaid Husain 

        // sb.reverse();
        // System.out.println(sb);  // niassuH diafuS

        // sb.charAt(0);
        // System.out.println(sb);

        // sb.setCharAt(0, 'D');
        // System.out.println(sb);
        
        // System.out.println(sb.length());

        // System.out.println(sb.capacity());

    }
    
}
        
        
        //ensureCapacity ()

        // trimtosize()




