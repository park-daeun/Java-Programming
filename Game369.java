import java.util.Scanner;

public class Game369 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n<10){
            if(n%3 == 0 && n != 0){
                System.out.println("Clap");
            }
        } else{
            int a = n/10;
            int b = n%10;

            if(a%3 == 0 && b%3 == 0){
                System.out.println("Clap, Clap");
            } else if(a%3 == 0 || b%3==0){
                System.out.println("Clap");
            }
        }

        scanner.close();
    }
}
