package InterfaceClass;

public class Circle implements Graph {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double grith() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }
}
