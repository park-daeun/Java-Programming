package Rectangle.RectangleClass;

import java.util.Scanner;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Scanner sc = new Scanner(System.in);

        r.base = sc.nextDouble();
        r.height = sc.nextDouble();
        System.out.println(r.getArea());
        sc.close();
    }
}
