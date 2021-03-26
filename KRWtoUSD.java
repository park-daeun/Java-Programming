import java.util.Scanner;

public class KRWtoUSD {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int KRW = scanner.nextInt();
        double USD = KRW/1100;

        System.out.println(KRW+" KRW is "+USD+" USD.");
        scanner.close();
    }
}
