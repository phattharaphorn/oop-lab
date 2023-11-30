public class Faculty extends Employee {

    // Attributes
    public double officeHours;
    public String rank;

    // Constructors
    public Faculty() {

    }

    // Methods
    @Override
    public String toString() {
        return super.toString()
                + "Faculty{office hours=" + this.officeHours
                + ", rank=" + this.rank + "} ";
    }
}