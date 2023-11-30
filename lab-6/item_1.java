import java.util.Scanner;
public class item_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine();
        System.out.println("Enter your age:");
        int age = in.nextInt();
        System.out.println("Enter your weight in pounds: ");
        double weight = in.nextDouble();
        System.out.println("Enter your height in inches: ");
        System.out.print("\tfeet:");
        double feet = in.nextDouble();
        System.out.print("\tinches:");
        double inches = in.nextDouble();
        BMI bmi = new BMI(name,age,weight,feet,inches);
        System.out.println("Your BMI is"+ bmi.getBMI());
        System.out.println("Your interpretation is " + bmi.getInterpretation());
        in.close();
    }
}
