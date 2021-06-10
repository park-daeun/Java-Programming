import java.util.*;

public class Q09 {
    public static void main(String[] args) {
        HashMap<String, Integer> customer = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("** REWARD Management System **");
        while (true) {
            System.out.print("Enter name & reward point >> ");

            String name = sc.next();
            if (name.equals("exit")) {
                break;
            }

            int point = sc.nextInt();

            Set<String> keys = customer.keySet();
            Iterator<String> it = keys.iterator();

            int isIn = 0;
            while (it.hasNext()) {
                String key_name = it.next();

                if (name.equals(key_name)) {
                    isIn = 1;
                    customer.put(name, customer.get(name) + point);
                }
            }
            if (isIn == 0) {
                customer.put(name, point);
            }

            Iterator<String> it2 = keys.iterator();
            while (it2.hasNext()) {
                String key_name = it2.next();
                System.out.printf("(%s, %d) ", key_name, customer.get(key_name));
            }
            System.out.println();
        }

        sc.close();
    }
}