public class item_4 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon octagon1 = new Octagon(5);

		System.out.println("Area: " + octagon1.getArea() + 
			"\nPerimeter: " + octagon1.getPerimeter());

		System.out.println("Cloning Octagon...");
		Octagon octagon2 = (Octagon)octagon1.clone();

		int result = (octagon1.compareTo(octagon2));
		if (result == 1)
			System.out.println("Octagon is greather than its clone.");
		else if (result == -1)
			System.out.println("Octagon is less than its clone."); 
		else
			System.out.println("Octagon is equal to its clone.");
	}
}
//GeometricObject4.java
//Octagon.java