public class item_1 {
public static void main(String[] args) {
   Account account = new Account();
    account.setId(1122);
    account.setBalance(20000);
    account.setAnnualInterestRate(4.5);

    account.withdraw(2500);
    account.deposit(3000);

    System.out.println("Balance: "+account.getBalance());
    System.out.println("Monthly Interest: "+account.getMonthlyInterest());
    System.out.println("Date when this account was created: "+account.getDateCreated());

}
    
} 
    
