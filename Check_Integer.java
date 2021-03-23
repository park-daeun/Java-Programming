import java.util.Scanner;

public class Check_Integer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n/10 == n%10){
            System.out.println("Yes! "+n/10+" & "+n%10+" are same.");
        } else{
            System.out.println("No! "+n/10+" & "+n%10+" are not same.");
        }

        scanner.close();
    }
}
