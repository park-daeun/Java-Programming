package CircleClass;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner sc = new Scanner(System.in);

        c.radius = sc.nextDouble();
        System.out.println(c.getArea());
        sc.close();
    }
}
