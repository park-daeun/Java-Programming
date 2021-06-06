import java.util.*;

class Location {
    String city;
    double latitude;
    double lognitude;

    public Location(String s, double d1, double d2) {
        this.city = s;
        this.latitude = d1;
        this.lognitude = d2;
    }
}

public class Q07 {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Location> al = new HashMap<String, Location>(4);

    private static void read() {
        System.out.println("Enter student name, major, id and average of grade.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String text = sc.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String city = st.nextToken().trim();
            double latit = Double.parseDouble(st.nextToken().trim());
            double longit = Double.parseDouble(st.nextToken().trim());

            al.put(city, new Location(city, latit, longit));
        }
    }

    private static void prinAll() {
        Set<String> keys = al.keySet();
        Iterator<String> it = keys.iterator();

        System.out.println("---------------------------");
        while (it.hasNext()) {
            String city = it.next();
            Location l = al.get(city);
            System.out.printf("%-8s %-8.1f %-8.1f\n", l.city, l.latitude, l.lognitude);
        }
        System.out.println("---------------------------");
    }

    private static void processQuery() {
        while (true) {
            System.out.print("City name >> ");
            String str = sc.next();

            if (str.equals("exit")) {
                break;
            }

            Location l = al.get(str);
            if (l == null) {
                System.out.printf("Location of %s is unknown.\n", str);
                continue;
            }

            System.out.printf("%-8s %-8.1f %-8.1f\n", l.city, l.latitude, l.lognitude);
        }
    }

    public static void main(String[] args) {
        read();
        prinAll();
        processQuery();
    }
}