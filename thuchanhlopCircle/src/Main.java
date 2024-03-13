import javafx.scene.shape.Circle;

import java.lang.reflect.Array;
import java.sql.SQLOutput;

public class ShapeTest  {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}


public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}


//Triển khai interface 'Comparable' cho các lớp hình học
import java.util.Array;

public class ComparableCircleTest {
    public static void main(String[]args){
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3, 6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);
        System.out.println("pre-sorted:");
        for (ComparableCircle circle: circles){
            System.out.println(circle);
        }

        Array.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle: circles) {
            System.out.println(circle);
        }
    }
}


//Triển khai interface 'Comparable' để so sánh các lớp hình học
import java.until.Arrays;
import java.until.Comparator;

public class CircleComparatorTest{
    public static void main(String[]args){
        Circle[] circles = new Circle[3];
        Circles[0] = new Circle(3.6);
        Circles[1] = new Circle();
        Circles[2] = new Circle(3.5, "indigo", false);
        System.out.println("pre-sorted");}
}