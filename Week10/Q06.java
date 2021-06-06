import java.util.*;

public class Q06 {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Student> al = new HashMap<String, Student>(4);

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

            al.put(name, new Student(name, department, id, grade));
        }
    }

    private static void printAll() {
        Set<String> keys = al.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String name = it.next();
            Student s = al.get(name);

            System.out.println("---------------------------");
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

            Student s = al.get(str);
            if (s == null) {
                continue;
            }

            System.out.println(s.name + ", " + s.major + ", " + s.id + ", " + s.average_of_grade);
        }
    }

    public static void main(String[] args) {
        read();
        printAll();
        processQuery();
    }
}