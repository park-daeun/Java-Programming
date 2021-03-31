import java.util.Scanner;

public class CircleConstructor {
    public double radius;

    public CircleConstructor() {
        radius = 3.0;
    }

    public double getArea() {
        double area = 3.14 * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        CircleConstructor c = new CircleConstructor();
        Scanner sc = new Scanner(System.in);

        System.out.println(c.getArea());

        c.radius = sc.nextDouble();
        System.out.println(c.getArea());
        sc.close();
    }
}