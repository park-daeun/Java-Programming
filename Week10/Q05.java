import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Student {
    String name;
    String major;
    String id;
    double average_of_grade;

    public Student(String s1, String s2, String i1, double i2) {
        this.name = s1;
        this.major = s2;
        this.id = i1;
        this.average_of_grade = i2;
    }
}

public class Q05 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> al = new ArrayList<Student>(4);

    private static void read() {
        System.out.println("Enter student name, major, id and average of grade.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String text = sc.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String name = st.nextToken().trim();
            String department = st.nextToken().trim();
            String id = st.nextToken().trim();
            double grade = Double.parseDouble(st.nextToken().trim());

            al.add(new Student(name, department, id, grade));
        }
    }

    private static void printAll() {
        for (int i = 0; i < 4; i++) {
            System.out.println("---------------------------");
            Student s = al.get(i);
            System.out.println("Name : " + s.name);
            System.out.println("Major : " + s.major);
            System.out.println("ID : " + s.id);
            System.out.println("Avg. Grade : " + s.average_of_grade);
            System.out.println("---------------------------");
        }
    }

    private static void processQuery() {
        while (true) {
            System.out.print("Student name >> ");
            String str = sc.next();

            if (str.equals("exit")) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                Student s = al.get(i);

                if (str.equals(s.name)) {
                    System.out.println(s.name + ", " + s.major + ", " + s.id + ", " + s.average_of_grade);
                }
            }
        }
    }

    public static void main(String[] args) {
        read();
        printAll();
        processQuery();
    }
}
