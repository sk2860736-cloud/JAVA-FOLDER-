package DAY16;
// ENCAPSULATION --> BTOH DATA AND BEHAVIOUR SHOULD BE TOGETHER ENCAPSULATED WITH AN OBJECT 
// WE SHOULD NOT PROVIDE UNRESTRICTED ACCESS OF DATA 

public class DAY16 {
    public static void main(String[] args) {
        bankAccount ba = new bankAccount();

        ba.Deposite(1000);
        ba.widraw(300);
        
      
        System.out.println(ba.getBalanace());
        
    }
}

    class bankAccount{
       private double balanace;

      public void Deposite(int amount){
            balanace += amount;

        }
       public void widraw(int amount){
            balanace -= amount;

        }
        public double getBalanace() {
            return balanace;
        }


    }
    

