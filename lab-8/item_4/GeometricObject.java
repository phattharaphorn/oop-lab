import java.util.Date;

public abstract class GeometricObject4 {

    private String color = null;
    private boolean filled = false;
    private Date dateCreated;

    protected GeometricObject4() {
        this.dateCreated = new Date();
    }

    protected GeometricObject4(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

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
        return "created on " + this.dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}