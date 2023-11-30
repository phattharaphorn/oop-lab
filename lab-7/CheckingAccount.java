public class CheckingAccount extends Account {

    // Attributes
    private double limit;

    // Constructors
    public CheckingAccount() {

    }

    // Methods
    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (this.getBalance() - amount >= -1 * this.limit) {
            this.setBalance(this.getBalance() - amount);
        } else {
            System.out.println("Cannot withdraw from Account");
        }
    }
}