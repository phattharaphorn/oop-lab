import java.util.Scanner;

public class item_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side;

        System.out.print("Enter side: ");
        side = in.nextDouble();
        while (side <= 0) {
            System.out.print("ERROR::Sides should be positive.\nPlease enter side again: ");
            side = in.nextDouble();
        }

        System.out.print("Enter is the triangle filled?: ");
        Boolean filled = in.nextBoolean();
        String color;
        if(filled){
            System.out.print("Enter color: ");
            color = in.next();
        }
        else color = null;
        Triangle triangle = new Triangle(color, filled, side);

        System.out.println("Area of triangle is " + triangle.getArea());
        System.out.println("Perimeter of triangle is " + triangle.getPerimeter());
        System.out.println("Color of triangle is " + triangle.getColor());
        System.out.println("Is triangle filled? : " + triangle.isFilled());

        in.close();
    }
}