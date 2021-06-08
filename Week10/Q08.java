import java.util.*;

public class Q08 {
    public static void main(String[] args) {
        HashMap<String, Double> student = new HashMap<String, Double>(5);
        Scanner sc = new Scanner(System.in);

        System.out.println("DK Scholarship management system.");
        for (int i = 0; i < 5; i++) {
            System.out.print("Name & grade >> ");
            String name = sc.next();
            double grade = sc.nextDouble();

            student.put(name, grade);
        }

        System.out.print("Input grade limitation >> ");
        double limit = sc.nextDouble();
        System.out.print("Scholarship students : ");

        Set<String> keys = student.keySet();
        Iterator<String> it = keys.iterator();

        while (it.hasNext()) {
            String name = it.next();

            if (student.get(name) >= limit) {
                System.out.print(name + " ");
            }
        }

        sc.close();
    }
}
