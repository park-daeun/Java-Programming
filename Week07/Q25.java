import java.util.Scanner;

class Day {
    private String todo;

    public void set(String todo) {
        this.todo = todo;
    }

    public String get() {
        return todo;
    }

    public void show() {
        if (todo == null)
            System.out.println("Nothing to do");
        else
            System.out.println(todo);
    }
}

public class Q25 {
    public static void main(String[] args) {
        System.out.println("Montly schdule management system");
        Scanner sc = new Scanner(System.in);
        Day d[] = new Day[30];
        while (true) {
            System.out.print("Todo (Input:1, Show:2, Quit:3) >> ");
            int num = sc.nextInt();

            if (num == 1) {
                System.out.print("Date(1-30) : ");
                int date = sc.nextInt();

                System.out.print("Todo(Enter string without space) ? ");
                String s = sc.next();
                d[date - 1] = new Day();
                d[date - 1].set(s);
            } else if (num == 2) {
                System.out.print("Date(1-30) : ");
                int date = sc.nextInt();
                d[date - 1].show();
            } else if (num == 3) {
                System.out.println("Quit program.");
                sc.close();
                return;
            }
        }
    }
}
