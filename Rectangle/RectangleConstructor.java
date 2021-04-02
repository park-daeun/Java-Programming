package Rectangle;

public class RectangleConstructor {
    public double base;
    public double height;

    public RectangleConstructor() {
        base = 5.0;
        height = 6.5;
    }

    public RectangleConstructor(double val1, double val2) {
        base = val1;
        height = val2;
    }

    public double getArea() {
        double area = base * height;
        return area;
    }

    public static void main(String[] args) {
        RectangleConstructor r1 = new RectangleConstructor();
        RectangleConstructor r2 = new RectangleConstructor(10.0, 20.0);

        System.out.println(r1.getArea());
        System.out.println(r2.getArea());
    }
}
