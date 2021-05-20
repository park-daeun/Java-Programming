import java.util.Scanner;

abstract class Converter2 {
    abstract protected double convert(double src);

    abstract protected String getSrcString();

    abstract protected String getDestString();

    protected double ratio;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert " + getSrcString() + " to " + getDestString());
        System.out.print("Enter " + getSrcString() + " >>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.print(val + " " + getSrcString() + " is converted to " + res + " " + getDestString());
        scanner.close();
    }
}

class Km2Mile extends Converter2 {
    public Km2Mile(double d) {
        ratio = d;
    }

    @Override
    protected double convert(double src) {
        return src / ratio;
    }

    @Override
    protected String getSrcString() {
        return "km";
    }

    @Override
    protected String getDestString() {
        return "Mile";
    }

}

public class Q2 {
    public static void main(String[] args) {
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}
