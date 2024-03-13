
public class Main {
    public static void main(String[] args) {
        MovablePoint point2 = new MovablePoint(10,12);
        point2.setX(20);
        point2.setY(20);
        System.out.println(point2.move());
    }
}