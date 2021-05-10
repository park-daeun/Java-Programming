import java.util.Scanner;

class Phone {
    public String name;
    public String tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
}

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of persons : ");
        int num = sc.nextInt();

        Phone[] per = new Phone[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Input name & phone number >> ");
            String insert_name = sc.next();
            String insert_tel = sc.next();

            per[i] = new Phone(insert_name, insert_tel);
        }
        System.out.println("Saved...");

        while (true) {
            System.out.print("Search >> ");
            String find_name = sc.next();

            if (find_name.equals("quit"))
                break;

            boolean find = false;
            for (int i = 0; i < num; i++) {
                if (find_name.equals(per[i].name)) {
                    find = true;
                    System.out.println(per[i].name + " / " + per[i].tel);
                    break;
                }
            }

            if (find == false) {
                System.out.println("Not found");
            }
        }

        sc.close();
    }
}
