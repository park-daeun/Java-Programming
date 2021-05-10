import java.util.Scanner;

class Seat {
    public String name;

    public Seat(String n) {
        this.name = n;
    }
}

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Seat[] s = new Seat[30];

        for (int i = 0; i < 30; i++) {
            s[i] = new Seat("null");
        }

        String name;
        int num;
        char class_type;

        int class_num;

        System.out.println("DK Concert hall reservation system");
        while (true) {
            System.out.println("1 : Reservation");
            System.out.println("2 : Status");
            System.out.println("3 : Cancel");
            System.out.println("4 : Quit");
            System.out.print(">>> ");
            int res_option = sc.nextInt();

            if (res_option == 1) {
                System.out.print("Class S(1), A(2), B(3) >> ");
                class_num = sc.nextInt();

                if (class_num == 1) {
                    System.out.print("Class S >> ");
                    for (int i = 0; i < 10; i++) {
                        if ((s[i].name).equals("null")) {
                            System.out.printf("-%d- ", i + 1);
                        } else {
                            System.out.print(s[i].name + " ");
                        }
                    }
                    class_type = 'S';
                } else if (class_num == 2) {
                    System.out.print("Class A >> ");
                    for (int i = 10; i < 20; i++) {
                        if ((s[i].name).equals("null")) {
                            System.out.printf("-%d- ", i - 10 + 1);
                        } else {
                            System.out.print(s[i].name + " ");
                        }
                    }
                    class_type = 'A';
                } else if (class_num == 3) {
                    System.out.print("Class B >> ");
                    for (int i = 20; i < 30; i++) {
                        if ((s[i].name).equals("null")) {
                            System.out.printf("-%d- ", i - 20 + 1);
                        } else {
                            System.out.print(s[i].name + " ");
                        }
                    }
                    class_type = 'B';
                } else {
                    System.out.println("Wrong number.\n");
                    continue;
                }

                System.out.print("\nName >> ");
                name = sc.next();
                System.out.print("Sheet number >> ");
                num = sc.nextInt();
                s[10 * (class_num - 1) + num - 1].name = name;
                System.out.printf("%c class sheet #%d reserved for %s\n\n", class_type, num, name);
            } else if (res_option == 2) {
                System.out.print("Class S >> ");
                for (int i = 0; i < 10; i++) {
                    if ((s[i].name).equals("null")) {
                        System.out.printf("-%d- ", i + 1);
                    } else {
                        System.out.print(s[i].name + " ");
                    }
                }
                System.out.print("\nClass A >> ");
                for (int i = 10; i < 20; i++) {
                    if ((s[i].name).equals("null")) {
                        System.out.printf("-%d- ", i - 10 + 1);
                    } else {
                        System.out.print(s[i].name + " ");
                    }
                }
                System.out.print("\nClass B >> ");
                for (int i = 20; i < 30; i++) {
                    if ((s[i].name).equals("null")) {
                        System.out.printf("-%d- ", i - 20 + 1);
                    } else {
                        System.out.print(s[i].name + " ");
                    }
                }
                System.out.print("\n\n");
            } else if (res_option == 3) {
                System.out.print("Class S(1), A(2), B(3) >> ");
                class_num = sc.nextInt();
                System.out.print("Name >> ");
                name = sc.next();
                if (class_num == 1)
                    class_type = 'S';
                else if (class_num == 2)
                    class_type = 'A';
                else if (class_num == 3)
                    class_type = 'B';
                else {
                    System.out.print("Wrong number.");
                    continue;
                }

                boolean find = false;

                for (int i = 0; i < 30; i++) {
                    if ((s[i].name).equals(name)) {
                        System.out.printf("Reservation for %s, Class %c #%d cancelled.\n\n", name, class_type,
                                i % 10 + 1);
                        s[i].name = "null";
                        find = true;
                        break;
                    }
                }

                if (find == false)
                    System.out.println("You didn't reserve our concert. Please check your name.\n");
            } else if (res_option == 4) {
                break;
            } else {
                System.out.println("Wrong number. Please enter again.");
            }
        }
        sc.close();
    }
}