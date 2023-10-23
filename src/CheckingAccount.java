public class CheckingAccount extends Account{


    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void withdraw(int n){
       balance -= n;
   }

   public int getDebt() {
        if (balance < 0) {
            return 0;
        } else {
            return -balance;
        }
   }
}
