public class Main {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        point1 =new Point2D(3,4);
        System.out.println(point1);

        Point3D point2 = new Point3D();
        point2 = new Point3D(5,6,7);
        point2.setY(10);
        point2.setZ(11);
        System.out.println(point2);
        float[] a = point2.getXYZ();
        System.out.println(a[1]);
    }
}