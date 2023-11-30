public class item_3 {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(3, 5, "blue", true);
		Rectangle r2 = new Rectangle(5, 3, "gray", false);
		Rectangle r3 = new Rectangle(3.1, 5, "blue", true);

		System.out.println("Rectangle1 Area :" + r1.getArea());
		System.out.println("Rectangle2 Area :" + r2.getArea());
		System.out.println("Rectangle3 Area :" + r3.getArea());

		System.out.println("Rectangle1 is " + (r1.equals(r2) ? "" : "not ") +
			"equal to Rectangle2");

		System.out.println("Rectangle1 is " + (r1.equals(r3) ? "" : "not ") +
			"equal to Rectangle3");
	}
}