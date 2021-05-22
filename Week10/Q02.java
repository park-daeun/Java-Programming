import java.util.Scanner;
import java.util.ArrayList;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();

        System.out.print("Enter grades of 6 students (A/B/C/D/F)>> ");
        for (int i = 0; i < 6; i++) {
            String s = sc.next();
            al.add(s);
        }
        sc.close();

        double grade = 0;
        for (int i = 0; i < 6; i++) {
            String s = al.get(i);
            char c = s.charAt(0);

            if (c == 'A') {
                grade += 4;
            } else if (c == 'B') {
                grade += 3;
            } else if (c == 'C') {
                grade += 2;
            } else if (c == 'D') {
                grade += 1;
            } else if (c == 'F') {
                grade += 0;
            } else {
                System.out.println("Invalid");
                return;
            }
        }

        System.out.println("Average : " + grade / 6);
    }
}
