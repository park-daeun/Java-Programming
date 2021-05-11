import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.printf("(%.1f, %.1f) r = %d\n", this.x, this.y, this.radius);
    }
}

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c[] = new Circle[3];
        int max = 0;
        int max_index = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("x, y, radius >> ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int r = sc.nextInt();
            c[i] = new Circle(x, y, r);

            if (max < r) {
                max = r;
                max_index = i;
            }
        }

        System.out.print("Biggest circle info is ");
        c[max_index].show();
        sc.close();
    }
}