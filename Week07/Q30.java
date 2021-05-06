class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint(int a, int b, String s) {
        super(a, b);
        this.color = s;
    }

    public void setXY(int a, int b) {
        super.move(a, b);
    }

    public void setColor(String s) {
        this.color = s;
    }

    public String ToString() {
        String str = this.color + " color on (" + super.getX() + ", " + super.getY() + ")";
        return str;
    }
}

public class Q30 {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.ToString();
        System.out.println(str);
    }
}
