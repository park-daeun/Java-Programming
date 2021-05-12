class TV {
    public String by;
    public int year;
    public int inch;

    public TV(String s, int a, int b) {
        by = s;
        year = a;
        inch = b;
    }

    public void show() {
        System.out.printf("My TV is %d inches manufactured by %s in %d.", inch, by, year);
    }
}

public class Q19 {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2021, 85);
        myTV.show();
    }
}