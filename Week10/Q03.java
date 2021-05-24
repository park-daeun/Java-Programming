import java.util.Scanner;
import java.util.HashMap;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> h = new HashMap<String, String>();

        System.out.println("Enter nation & population (Ex: Korea 5000)");
        while (true) {
            System.out.print("Nation & population >> ");
            String nation = sc.next();
            if (nation.equals("stop")) {
                break;
            }

            String population = sc.next();
            h.put(nation, population);
        }

        while (true) {
            System.out.print("Search population of ");
            String search_nation = sc.next();
            if (search_nation.equals("exit")) {
                break;
            }

            String search_population = h.get(search_nation);
            if (search_population == null) {
                System.out.println("Cannot find " + search_nation);
            } else {
                System.out.println("Population of " + search_nation + " is " + search_population);
            }
        }

        sc.close();
    }
}
