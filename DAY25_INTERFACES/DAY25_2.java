package DAY25_INTERFACES;

public class DAY25_2 {
    public static void main(String[] args) {
        Payment p = new CreditCard();
        p.Pay();

        // Payment p = new DebitCard();
        // p.Pay();
        
        
    }
    
}

interface Payment {
    void Pay();
    
}

class CreditCard implements Payment {
    @Override
    public void Pay(){
        System.out.println("PAYING VIA CREDITCARD. ");
    }
}
class DebitCard implements Payment {
    @Override
    public void Pay(){
        System.out.println("PAYING VIA DEBIT CARD. ");
    }
}