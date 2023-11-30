import java.time.LocalDate;

public class Employee extends Person {

    // Attributes
    public String office;
    public double salary;
    public LocalDate dateHired;

    // Constructors
    public Employee() {

    }

    // Methods
    @Override
    public String toString() {
        return super.toString() + "Employee{office=" + this.office
                + ", salary=" + this.salary
                + ", dateHired=" + this.dateHired
                + "} ";
    }
}