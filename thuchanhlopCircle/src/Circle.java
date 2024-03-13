import java.util.Comparator;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle (double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}


//Triển khai interface 'Comparable' cho các lớp hình học
public class ComparableCircle extends Circle{
        implements Comparable <ComparableCircle>{
    }
    public ComparableCircle (){
    }
    public ComparableCircle (double radius){
            super(radius);
    }
    public ComparableCircle (double radius, String color, boolean filled){
            super(radius, color, filled);
    }
    public int comparableTo(ComparableCircle o){
            if (getRadius() > o.getRadius())
                return 1;
            else if (getRadius() < o.getRadius())
                return -1;
            else return 0;}
    }
}


//Triển khai interface 'Comparable' để so sánh các lớp hình học
import java.until.Comparator;
public class CircleComparator implements Comparator<Circle>{
    public int Copare (Circle c1, Circle c2){
        if (c1.getRadius() > c2.getRadius())
            return -1;
        else if (c1.getRadius() < c2.getRadius())
            return 1;
        else return 0;
    }
}