import java.util.Scanner;

public class item_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012):");
        int y = input.nextInt();
        if (y < 1) {
            System.out.print("Error, please input valid year");
            return;
        }
        System.out.print("Enter month: 1-12:");
        int m = input.nextInt();
        if (m > 12 || m < 1) {
            System.out.print("Error, please input valid month");
            return;
        }
        System.out.print("Enter the day of the month: 1-31:");
        int q = input.nextInt();
        if (q > 31 || q < 1) {
            System.out.print("Error, please input valid day");
            return;
        }
        if ((m == 4 || m == 6 || m == 9 || m == 11) && q > 30) {
            System.out.print("Error, please input valid day");
            return;
        }
        boolean leap;
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else
            leap = false;

        if (m == 2) {
            if (leap == true && q > 29) {
                System.out.println("Error, please input valid day");
                return;
            } else if (leap == false && q > 28) {
                System.out.println("Error, please input valid day");
                return;
            }
        }
        if (m == 1 || m == 2) {
            m = m + 12;
            y = y - 1;
        }

        int j = y / 100;
        int k = y % 100;
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        String day = "";

        switch (h) {
            case 0:
                day = "Saturday";
                break;
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
        }

        System.out.print("Day of the week is " + day);
    }
}