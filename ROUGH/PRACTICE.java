package ROUGH;

public class PRACTICE {
    public static void main(String[] args) {
        int status = PaymentStatus.SUCCESS;

        System.out.println(status);

       int status2 = 100;
       System.out.println(status2);

        
    }
    
}

class PaymentStatus{
    public static final int SUCCESS = 1;
    public static final int PROCESS = 2;
    public static final int FAILED = 3;

}
