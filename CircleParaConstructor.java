public class CircleParaConstructor {
    public double radius;

    public CircleParaConstructor(double val) {
        radius = val;
    }

    public double getArea() {
        double area = 3.14 * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        CircleParaConstructor c1 = new CircleParaConstructor(5.0);
        CircleParaConstructor c2 = new CircleParaConstructor(6.0);

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
    }
}