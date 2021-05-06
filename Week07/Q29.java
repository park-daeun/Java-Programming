class TV_29 {
    private int size;

    public TV_29(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
}

class ColorTV_29 extends TV_29 {
    private int color;

    public ColorTV_29(int a, int b) {
        super(a);
        this.color = b;
    }

    protected int getSize() {
        return super.getSize();
    }

    protected int getColor() {
        return color;
    }
}

class IPTV extends ColorTV_29 {
    private String ip;

    public IPTV(String i, int a, int b) {
        super(a, b);
        this.ip = i;
    }

    public void printProperty() {
        System.out.printf("My IPTV is %d inches, %d colors and IP address is %s\n", super.getSize(), super.getColor(),
                ip);
    }
}

public class Q29 {
    public static void main(String[] args) {
        IPTV myTV = new IPTV("192.1.1.2", 64, 2047);
        myTV.printProperty();
    }
}
