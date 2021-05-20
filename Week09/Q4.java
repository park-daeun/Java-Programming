interface Shape {
    final double PI = 3.14;

    void draw();

    double getArea();

    default public void redraw() {
        System.out.print("-- Redraw : ");
        draw();
    }
}

class Circle implements Shape {
    private double r;

    public Circle(double d) {
        this.r = d;
    }

    @Override
    public void draw() {
        System.out.println("Circle with radius " + r);
    }

    @Override
    public double getArea() {
        return r * r * PI;
    }

}

public class Q4 {
    public static void main(String[] args) {
        Shape donut = new Circle(10); // Radius is 10
        donut.redraw();
        System.out.println("Area : " + donut.getArea());
    }
}
