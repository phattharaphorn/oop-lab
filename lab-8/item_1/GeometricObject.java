import java.util.Date;

public abstract class GeometricObject {

    // Attributes
    private String color;
    private boolean filled;
    private Date dateCreated;

    // Constructors
    protected GeometricObject() {
        this.dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    // Methods
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{color=" + this.color +
                ",filled=" + this.filled +
                ",dateCreated=" + this.dateCreated + "} ";
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}