public class Person {

    // Attributes
    public String name;
    public String address;
    public String phoneNumber;
    public String emailAddress;

    // Constructors
    public Person() {

    }

    // Methods
    @Override
    public String toString() {
        return "Person{name=" + this.name +
                ", address=" + this.address +
                ", phoneNumber=" + this.phoneNumber +
                ", emailAddress=" + this.emailAddress + "} ";
    }
}