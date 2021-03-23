import java.util.Scanner;

public class Personal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String country = scanner.next();
        int age = scanner.nextInt();
        double weight = scanner.nextDouble();
        boolean single = scanner.nextBoolean();

        System.out.println(name+" is from "+country+", "+age+" years old, "+weight+" kg.");
        System.out.println(name+" is "+ (single ? "single" : "Married"));
        scanner.close();
    }
}
