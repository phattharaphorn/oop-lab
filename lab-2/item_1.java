import java.util.Scanner;

public class item_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int date = in.nextInt();
        if (date > 6 || date < 0) {
            System.out.print("Error, please input number between 0-6");
            return;
        }
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = in.nextInt();

        int future_date = (date + elapsed) % 7;
        String day_of_week = " ";

        switch (date) {
            case 0:
                day_of_week = "SUNDAY";
                break;
            case 1:
                day_of_week = "MONDAY";
                break;
            case 2:
                day_of_week = "TUESDAY";
                break;
            case 3:
                day_of_week = "WEDNESDAY";
                break;
            case 4:
                day_of_week = "THURSDAY";
                break;
            case 5:
                day_of_week = "FRIDAY";
                break;
            case 6:
                day_of_week = "SATURDAY";
                break;
        }
        if (future_date == 0) {
            System.out.printf("Today is %s and the future day is SUNDAY", day_of_week);
        } else if (future_date == 1) {
            System.out.printf("Today is %s and the future day is MONDAY", day_of_week);
        } else if (future_date == 2) {
            System.out.printf("Today is %s and the future day is TUESDAY", day_of_week);
        } else if (future_date == 3) {
            System.out.printf("Today is %s and the future day is WEDNESDAY", day_of_week);
        } else if (future_date == 4) {
            System.out.printf("Today is %s and the future day is THURSDAY", day_of_week);
        } else if (future_date == 4) {
            System.out.printf("Today is %s and the future day is FRIDAY", day_of_week);
        } else if (future_date == 4) {
            System.out.printf("Today is %s and the future day is SATURDAY", day_of_week);
        }
    }
}