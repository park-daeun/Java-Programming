import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String course[] = { "Java", "C++", "HTML", "Kotlin", "Python" };
        int score[] = { 95, 88, 76, 62, 55 };

        while (true) {
            System.out.print("Subject >> ");
            String name = scanner.next();

            if (name.equals("Quit")) {
                scanner.close();
                return;
            }

            int num = 0;
            for (int i = 0; i < 5; i++) {
                if (course[i].equals(name)) {
                    num = score[i];
                    System.out.printf("Score is %d\n", num);
                }
            }

            if (num == 0) {
                System.out.println("Invalid subject");
            }
        }
    }
}
