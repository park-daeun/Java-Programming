class TV_28 {
    private int size;

    public TV_28(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
}

class ColorTV extends TV_28 {
    private int color;

    public ColorTV(int a, int b) {
        super(a);
        this.color = b;
    }

    public void printProperty() {
        System.out.printf("%d inches, %d colors", super.getSize(), this.color);
    }
}

public class Q28 {
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(64, 1024);
        myTV.printProperty();
    }
}