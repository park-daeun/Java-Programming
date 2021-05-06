class ColorPoint_31 extends Point {
    private String color;

    public ColorPoint_31() {
        super(0, 0);
        this.color = "BLACK";
    }

    public ColorPoint_31(int a, int b) {
        super(a, b);
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

public class Q31 {
    public static void main(String[] args) {
        ColorPoint_31 zeroPoint = new ColorPoint_31();
        System.out.println(zeroPoint.ToString());

        ColorPoint_31 cp = new ColorPoint_31(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.ToString());
    }
}