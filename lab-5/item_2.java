public class item_2 {
    public static void main(String[] args) {
        RegularPolygon r1 = new RegularPolygon();
        RegularPolygon r2 = new RegularPolygon(6, 4);
        RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("The perimeter of r1: " + r1.getPerimeter());
        System.out.println("The area of r1: " + r1.getArea());
        System.out.println("The perimeter of r2: " + r2.getPerimeter());
        System.out.println("The area of r2: " + r2.getArea());
        System.out.println("The perimeter of r3: " + r3.getPerimeter());
        System.out.println("The area of r3: " + r3.getArea());
    }

}
