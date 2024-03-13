public class Circle {
    private double radius=1;
    private String color = "red";

    public Circle() {
    }
    public Circle(double radius, String color) {
        this.radius=radius;
        this.color=color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return " radius= " + getRadius() + " color= " + getColor();
    }
}