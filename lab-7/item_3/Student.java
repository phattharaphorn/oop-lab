public class Student extends Person {

    // Attributes
    public enum status {
        FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
    }

    public String statusCode;

    // Constructors
    public Student() {
        this.statusCode = "FRESHMAN";
    }

    // Methods
    @Override
    public String toString() {
        return super.toString() + "Student{status=" + status.valueOf(statusCode) + "} ";
    }
}