class TV {
    private int size;

    public TV(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
}

class IPTV extends TV {
    private String ip;
    private String channel;

    public IPTV(String s1, int a, String s2) {
        super(a);
        this.ip = s1;
        this.channel = s2;
    }

    public void printProperty() {
        System.out.printf("My TV is %d and IP address is %s, supports to play %s\n", super.getSize(), this.ip,
                this.channel);
    }
}

public class Q3 {
    public static void main(String[] args) {
        IPTV myTV = new IPTV("192.1.1.2", 82, "Netflix");
        myTV.printProperty();
    }
}
