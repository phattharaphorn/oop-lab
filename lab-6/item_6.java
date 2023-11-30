import java.util.Scanner;

public class item_6 {
    public static void main(String[] args) {

        // Create Defualt
        Account accounts[] = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account();
            accounts[i].setId(i);
            accounts[i].setBalance(100);
        }

        // Enter id
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an id: ");
        int id = in.nextInt();
        while (id > 9 || id < 0) {
            System.out.print("Please enter a correct id: ");
            id = in.nextInt();
        }

        // Main menu
        int choice;
        do {
            System.out.println("\nMain menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            System.out.print("Enter a choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The balance is " + accounts[id].getBalance());
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    double w = in.nextDouble();
                    accounts[id].withdraw(w);
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit: ");
                    double d = in.nextDouble();
                    accounts[id].deposit(d);
                    break;
            }
        } while (choice != 4);
        System.out.println("End of Program.");
        in.close();
    }
}