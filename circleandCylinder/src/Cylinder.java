public class Cylinder extends Circle {
    private double height = 3.0;

    public Cylinder () {

    }
    public Cylinder (double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume () {
        return getRadius()*getRadius()*Math.PI*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder " + "volume= " + getVolume() + " có "+ "height=" + height + super.toString();
    }
}