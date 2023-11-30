import java.util.Scanner;

public class item_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Square[] square = new Square[5];
        for(int i=0;i<5;i++){
            System.out.print("Is square"+(i+1)+" filled? : ");
            boolean filled = in.nextBoolean();
            String color;
            if(filled){
                System.out.print("Enter color: ");
                color = in.next();
            }
            else color = null;
            System.out.print("Enter side: ");
            double side = in.nextDouble();
            while (side <= 0) {
                System.out.print("ERROR::Sides should be positive.\nPlease enter side again: ");
                side = in.nextDouble();
            }
            square[i] = new Square(color,filled,side);
        }
        for(int i=0;i<5;i++){
            System.out.println("Area of square"+(i+1)+" : "+square[i].getArea());
            if(square[i].isFilled())square[i].howToColor();
            System.out.println();
        }
        in.close();
    }
}
