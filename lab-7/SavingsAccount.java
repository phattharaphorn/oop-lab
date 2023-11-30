public class SavingsAccount extends Account{
    
    //Attributes

    //Constructors
    public SavingsAccount(){

    }
    //Methods
    @Override
    public void withdraw(double amount) {
        if (this.getBalance() - amount >= 0 ) {
            this.setBalance(this.getBalance() - amount);
        } else {
            System.out.println("Cannot withdraw from Account");
        }
    }
}
