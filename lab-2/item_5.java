import java.util.Scanner;

public class item_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();
        if (numberOfLines > 15 || numberOfLines < 1) {
            System.out.print("Error, please input number between 1-15");
            return;
        }
        for (int rows = 1; rows <= numberOfLines; rows++) {

            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }

            for (int l = rows; l >= 2; l--) {
                System.out.print(l + " ");
            }

            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }

            System.out.println();
        }
    }
}