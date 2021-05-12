import java.util.Scanner;

class Grade {
    int score1, score2, score3;

    public Grade(int s1, int s2, int s3) {
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }

    public int average() {
        return (score1 + score2 + score3) / 3;
    }
}

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input scores in order of Math, Science and English >> ");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();

        Grade me = new Grade(math, science, english);
        System.out.println("Average : " + me.average());
        scanner.close();
    }
}