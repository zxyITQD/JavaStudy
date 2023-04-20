package InterfaceClass;

public class Rectangle implements Graph {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 矩形周长
    @Override
    public double grith() {
        return 2 * (width + height);
    }
    // 矩形面积
    @Override
    public double area() {
        return width * height;
    }
}
