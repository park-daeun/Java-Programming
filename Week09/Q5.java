class Rect implements Shape {
    double d1;
    double d2;

    public Rect(double a, double b) {
        this.d1 = a;
        this.d2 = b;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with size " + d1 + "x" + d2);
    }

    @Override
    public double getArea() {
        return d1 * d2;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Shape[] list = new Shape[2];
        list[0] = new Circle(10); // Circle with Radius 10
        list[1] = new Rect(10, 40); // 10x40 Rectangle
        for (int i = 0; i < list.length; i++)
            list[i].redraw();
        for (int i = 0; i < list.length; i++)
            System.out.println("Area : " + list[i].getArea());
    }
}
