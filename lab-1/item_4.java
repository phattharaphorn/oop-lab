import java.util.Scanner;

public class item_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.print("Enter weight in pounds: ");
        double weight = in.nextDouble();
        
        System.out.print("Enter height in inches: ");
        double height = in.nextDouble();

        double weightInKg = weight * 0.45359237; // Convert to Metric System 
        double heightInM = height * 0.0254; // Convert to Metric System 

        double BMI = weightInKg / (heightInM*heightInM);

        System.out.printf("BMI is %.4f\n", BMI);

    }
}